package realm;

import dao.UserMapper;
import dao.extend.UserMapperExtends;
import model.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

    private UserMapperExtends userMapperExtends;

    @Autowired
    public  UserRealm(UserMapperExtends userMapperExtends) {
        this.userMapperExtends = userMapperExtends;
    }

    public String getName() {
        return "UserRealm";
    }

    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("调用realm");
        User user = (User) principalCollection.getPrimaryPrincipal();
        if (user.getIfBan()==1)
            return null;
        //查找用户权限
        List<String> permissions = userMapperExtends.selectUserPermissionBylevel(user.getLevel());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从token中获取到登录的用户名，查询数据库，返回用户信息
        String username = (String) authenticationToken.getPrincipal();
        User user = userMapperExtends.selectByemail(username);

        if (user == null)
            return null;

        return new SimpleAuthenticationInfo(user, user.getPsw(), getName());
    }
}
