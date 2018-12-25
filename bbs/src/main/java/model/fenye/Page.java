package model.fenye;

import org.springframework.stereotype.Repository;

@Repository
public class Page {
    private int postCount;
    private int limit;
    private int pageNum;
    private int maxPageNum;
    private int startIndex;

    public Page(){}
    public Page(int limit, int pageNum) {
        this.limit = limit;
        this.pageNum = pageNum;
    }

    public int getStartIndex() {
        return  (pageNum - 1) * limit;
    }

    public Page(int pageNum) {
        this.limit = 5;
        this.pageNum = pageNum;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getLimit() {
        return limit;
    }

    public int getPageNum() {
        return pageNum;
    }


    public int getMaxPageNum() {
        return (postCount % limit) == 0?postCount/limit : postCount/limit + 1 ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"postCount\":")
                .append(postCount);
        sb.append(",\"limit\":")
                .append(limit);
        sb.append(",\"pageNum\":")
                .append(pageNum);
        sb.append(",\"maxPageNum\":")
                .append(maxPageNum);
        sb.append(",\"startIndex\":")
                .append(startIndex);
        sb.append('}');
        return sb.toString();
    }
}
