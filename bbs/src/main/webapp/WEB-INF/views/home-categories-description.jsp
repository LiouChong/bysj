<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<!doctype html>
        <!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en-US"> <![endif]-->
        <!--[if IE 7]>    <html class="lt-ie9 lt-ie8" lang="en-US"> <![endif]-->
        <!--[if IE 8]>    <html class="lt-ie9" lang="en-US"> <![endif]-->
        <!--[if gt IE 8]><!--> <html lang="en-US"> <!--<![endif]-->
        <head>
                <!-- META TAGS -->
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

                <title>Knowledge Base Theme</title>

                <link rel="shortcut icon" href="images/favicon.png" />


                

                <!-- Style Sheet-->
                <%--<link rel="stylesheet" href="style.css"/>--%>
                <link rel='stylesheet' id='bootstrap-css-css'  href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
                <link rel='stylesheet' id='responsive-css-css'  href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
                <link rel='stylesheet' id='pretty-photo-css-css'  href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
                <link rel='stylesheet' id='main-css-css'  href='css/main5152.css?ver=1.0' type='text/css' media='all' />
                <link rel='stylesheet' id='custom-css-css'  href='css/custom5152.html?ver=1.0' type='text/css' media='all' />


                <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
                <!--[if lt IE 9]>
                <script src="js/html5.js"></script></script>
                <![endif]--> <style type="text/css">
                .butclass {
                        background-color: #0d90d1;
                        display: inline-block;
                        outline: none;
                        cursor: pointer;
                        text-align: center;
                        text-decoration: none;
                        font: 14px/100% Arial, Helvetica, sans-serif;
                        padding: .5em 2em .55em;
                        text-shadow: 0 1px 1px rgba(0,0,0,.3);
                        -webkit-border-radius: .5em;
                        -moz-border-radius: .5em;
                        border-radius: .5em;
                        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
                        -moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
                        box-shadow: 0 1px 2px rgba(0,0,0,.2);
                }
                .butclass:hover {
                        text-decoration: none;
                }
                .butclass:active {
                        position: relative;
                        top: 1px;
                }
        </style>

        </head>

        <body>

                <!-- Start of Header -->
                <div class="header-wrapper">
                        <header>
                                <div class="container">


                                        <div class="logo-container">
                                                <!-- Website Logo -->
                                                <a href="/index-2" title="Knowledge Base Theme">
                                                        <img src="images/logo.png" alt="Knowledge Base Theme">
                                                </a>
                                                <span class="tag-line">Premium WordPress Theme</span>
                                        </div>


                                        <!-- Start of Main Navigation -->
                                        <nav class="main-nav">
                                                <div class="menu-top-menu-container">
                                                        <ul id="menu-top-menu" class="clearfix">
                                                                <li ><a href="/index-2">首页</a></li>
                                                                <li class="current-menu-item"><a href="/home-categories-description">推荐</a></li>
                                                                <%--<li><a href="/home-categories-articles">categories-articles</a></li>--%>
                                                                <li><a href="/articles-list">最新</a></li>
                                                                <li><a href="/faq">常见问题</a></li>
                                                                <li><a href="/contact">联系我们</a></li>
                                                                <shiro:guest><li><a href="/login">登录  注册</a> </li></shiro:guest>
                                                                <shiro:user><li>欢迎您：<a href="/myInfo"><shiro:principal property="email"></shiro:principal> </a>&emsp;</li> <a href="/logout" style="color: white">注销</a> </shiro:user>
                                                        </ul>
                                                </div>
                                        </nav>
                                        <!-- End of Main Navigation -->

                                </div>
                        </header>
                </div>
                <!-- End of Header -->

                <!-- Start of Search Wrapper -->
                <div class="search-area-wrapper">
                        <div class="search-area container">
                                <h3 class="search-header">Have a Question?</h3>
                                <p class="search-tag-line">If you have any question you can ask below or enter what you are looking for!</p>

                                <form id="search-form" class="search-form clearfix" method="get" action="#" autocomplete="off">
                                        <input class="search-term required" type="text" id="s" name="s" placeholder="Type your search terms here" title="* Please enter a search term!" />
                                        <input class="search-btn" type="submit" value="Search" />
                                        <div id="search-error-container"></div>
                                </form>
                        </div>
                </div>
                <!-- End of Search Wrapper -->

                <!-- Start of Page Container -->
                <div class="page-container">
                        <div class="container">
                                <div class="row">

                                        <!-- start of page content -->
                                        <div class="span8 page-content">

                                                <!-- Basic Home Page Template -->
                                                <div class="row separator">
                                                        <section class="span4 articles-list">
                                                                <h3>Featured Articles</h3>
                                                                <ul class="articles">
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">Integrating WordPress with Your Website</a></h4>
                                                                                <span class="article-meta">25 Feb, 2013 in <a href="#" title="View all posts in Server &amp; Database">Server &amp; Database</a></span>
                                                                                <span class="like-count">66</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">WordPress Site Maintenance</a></h4>
                                                                                <span class="article-meta">24 Feb, 2013 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                                                                                <span class="like-count">15</span>
                                                                        </li>
                                                                        <li class="article-entry video">
                                                                                <h4><a href="/single">Meta Tags in WordPress</a></h4>
                                                                                <span class="article-meta">23 Feb, 2013 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                                                                                <span class="like-count">8</span>
                                                                        </li>
                                                                        <li class="article-entry image">
                                                                                <h4><a href="/single">WordPress in Your Language</a></h4>
                                                                                <span class="article-meta">22 Feb, 2013 in <a href="#" title="View all posts in Advanced Techniques">Advanced Techniques</a></span>
                                                                                <span class="like-count">6</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">Know Your Sources</a></h4>
                                                                                <span class="article-meta">22 Feb, 2013 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                                                                                <span class="like-count">2</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">Validating a Website</a></h4>
                                                                                <span class="article-meta">21 Feb, 2013 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                                                                                <span class="like-count">3</span>
                                                                        </li>
                                                                </ul>
                                                        </section>

                                                        <section class="span4 articles-list">
                                                                <h3>Latest Articles</h3>
                                                                <ul class="articles">
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">Integrating WordPress with Your Website</a></h4>
                                                                                <span class="article-meta">25 Feb, 2013 in <a href="#" title="View all posts in Server &amp; Database">Server &amp; Database</a></span>
                                                                                <span class="like-count">66</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">Using Javascript</a></h4>
                                                                                <span class="article-meta">25 Feb, 2013 in <a href="#" title="View all posts in Advanced Techniques">Advanced Techniques</a></span>
                                                                                <span class="like-count">18</span>
                                                                        </li>
                                                                        <li class="article-entry image">
                                                                                <h4><a href="/single">Using Images</a></h4>
                                                                                <span class="article-meta">25 Feb, 2013 in <a href="#" title="View all posts in Designing in WordPress">Designing in WordPress</a></span>
                                                                                <span class="like-count">7</span>
                                                                        </li>
                                                                        <li class="article-entry video">
                                                                                <h4><a href="/single">Using Video</a></h4>
                                                                                <span class="article-meta">24 Feb, 2013 in <a href="#" title="View all posts in WordPress Plugins">WordPress Plugins</a></span>
                                                                                <span class="like-count">7</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">WordPress Site Maintenance</a></h4>
                                                                                <span class="article-meta">24 Feb, 2013 in <a href="#" title="View all posts in Website Dev">Website Dev</a></span>
                                                                                <span class="like-count">15</span>
                                                                        </li>
                                                                        <li class="article-entry standard">
                                                                                <h4><a href="/single">WordPress CSS Information and Techniques</a></h4>
                                                                                <span class="article-meta">24 Feb, 2013 in <a href="#" title="View all posts in Theme Development">Theme Development</a></span>
                                                                                <span class="like-count">1</span>
                                                                        </li>
                                                                </ul>
                                                        </section>
                                                </div>

                                                <div class="row home-category-list-area">
                                                        <div class="span8">
                                                                <h2>Categories</h2>
                                                        </div>
                                                </div>

                                                <div class="row-fluid top-cats">

                                                        <section class="span4">
                                                                <h4 class="category"><a href="#">WordPress for Beginners</a></h4>
                                                                <div class="category-description">
                                                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
                                                                </div>
                                                        </section>

                                                        <section class="span4">
                                                                <h4 class="category"><a href="#">Designing in WordPress</a></h4>
                                                                <div class="category-description">
                                                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet</p>
                                                                </div>
                                                        </section>

                                                        <section class="span4">
                                                                <h4 class="category"><a href="#">Theme Development</a></h4>
                                                                <div class="category-description">
                                                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna</p>
                                                                </div>
                                                        </section>
                                                </div>
                                                <div class="row-fluid top-cats">

                                                        <section class="span4">
                                                                <h4 class="category"><a href="#">Website Dev</a></h4>
                                                                <div class="category-description">
                                                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam</p>
                                                                </div>
                                                        </section>

                                                        <section class="span4">
                                                                <h4 class="category">
                                                                        <a href="#">WordPress Plugins</a></h4>
                                                                <div class="category-description">
                                                                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore</p>
                                                                </div>
                                                        </section>

                                                        <section class="span4">
                                                                <h4 class="category"><a href="#">Advanced Techniques</a></h4>
                                                                <div class="category-description"><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut</p>
                                                                </div>
                                                        </section>
                                                </div>

                                        </div>
                                        <!-- end of page content -->


                                        <!-- start of sidebar -->
                                        <aside class="span4 page-sidebar">
                                                <section class="widget">
                                                        <div class="support-widget">
                                                                <h3 class="title">发帖分享</h3>
                                                                <p class="intro">最近有什么令你自己激动的发现或令你烦恼的bug吗？分享出来你的想法吧！</p>
                                                                <a href="/getPostPage"><input type="button" class="butclass" value="发帖"></a>

                                                        </div>
                                                </section>

                                                <section class="widget">
                                                        <div class="quick-links-widget">
                                                                <h3 class="title">Quick Links</h3>
                                                                <ul id="menu-quick-links" class="menu clearfix">
                                                                        <li><a href="/index-2">Home</a></li>
                                                                        <li><a href="/articles-list">Articles List</a></li>
                                                                        <li><a href="/faq">FAQs</a></li>
                                                                        <li><a href="/contact">Contact</a></li>
                                                                </ul>
                                                        </div>
                                                </section>

                                                <section class="widget">
                                                        <h3 class="title">标签</h3>
                                                        <div class="tagcloud">
                                                                <a href="#" class="btn btn-mini">Java</a>
                                                                <a href="#" class="btn btn-mini">C</a>
                                                                <a href="#" class="btn btn-mini">C++</a>
                                                                <a href="#" class="btn btn-mini">Python</a>
                                                                <a href="#" class="btn btn-mini">PHP</a>
                                                                <a href="#" class="btn btn-mini">JavaScript</a>
                                                                <a href="#" class="btn btn-mini">C#</a>
                                                                <a href="#" class="btn btn-mini">SQL</a>
                                                                <a href="#" class="btn btn-mini">R</a>
                                                                <a href="#" class="btn btn-mini">Android</a>
                                                                <a href="#" class="btn btn-mini">Ruby</a>
                                                                <a href="#" class="btn btn-mini">Go</a>
                                                                <a href="#" class="btn btn-mini">.NET</a>
                                                                <a href="#" class="btn btn-mini">腰椎间盘的护理</a>
                                                                <a href="#" class="btn btn-mini">高血压预防</a>
                                                                <a href="#" class="btn btn-mini">如何不掉发</a>
                                                                <a href="#" class="btn btn-mini">精神病学</a>
                                                                <a href="#" class="btn btn-mini">其他</a>
                                                        </div>
                                                </section>

                                        </aside>
                                        <!-- end of sidebar -->
                                </div>
                        </div>
                </div>
                <!-- End of Page Container -->

                <!-- Start of Footer -->
                <footer id="footer-wrapper">
                        <div id="footer" class="container">
                                <div class="row">

                                        <div class="span3">
                                                <section class="widget">
                                                        <h3 class="title">How it works</h3>
                                                        <div class="textwidget">
                                                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. </p>
                                                                <p>Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. </p>
                                                        </div>
                                                </section>
                                        </div>

                                        <div class="span3">
                                                <section class="widget"><h3 class="title">Categories</h3>
                                                        <ul>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet,">Advanced Techniques</a> </li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet,">Designing in WordPress</a></li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet,">Server &amp; Database</a></li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet, ">Theme Development</a></li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet,">Website Dev</a></li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet,">WordPress for Beginners</a></li>
                                                                <li><a href="#" title="Lorem ipsum dolor sit amet, ">WordPress Plugins</a></li>
                                                        </ul>
                                                </section>
                                        </div>

                                        <div class="span3">
                                                <section class="widget">
                                                        <h3 class="title">Latest Tweets</h3>
                                                        <div id="twitter_update_list">
                                                                <ul>
                                                                        <li>No Tweets loaded !</li>
                                                                </ul>
                                                        </div>
                                                        <%--<script src="http://twitterjs.googlecode.com/svn/trunk/src/twitter.min.js" type="text/javascript"></script>--%>
                                                        <script type="text/javascript" >
                                                                getTwitters("twitter_update_list", {
                                                                        id: "960development",
                                                                        count: 3,
                                                                        enableLinks: true,
                                                                        ignoreReplies: true,
                                                                        clearContents: true,
                                                                        template: "%text% <span>%time%</span>"
                                                                });
                                                        </script>
                                                </section>
                                        </div>

                                        <div class="span3">
                                                <section class="widget">
                                                        <h3 class="title">Flickr Photos</h3>
                                                        <div class="flickr-photos" id="basicuse">
                                                        </div>
                                                </section>
                                        </div>

                                </div>
                        </div>
                        <!-- end of #footer -->

                        <!-- Footer Bottom -->
                        <div id="footer-bottom-wrapper">
                                <div id="footer-bottom" class="container">
                                        <div class="row">
                                                <div class="span6">
                                                        <p class="copyright">
                                                                Copyright © 2013. All Rights Reserved by KnowledgeBase.Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                                                        </p>
                                                </div>
                                                <div class="span6">
                                                        <!-- Social Navigation -->
                                                        <ul class="social-nav clearfix">
                                                                <li class="linkedin"><a target="_blank" href="#"></a></li>
                                                                <li class="stumble"><a target="_blank" href="#"></a></li>
                                                                <li class="google"><a target="_blank" href="#"></a></li>
                                                                <li class="deviantart"><a target="_blank" href="#"></a></li>
                                                                <li class="flickr"><a target="_blank" href="#"></a></li>
                                                                <li class="skype"><a target="_blank" href="skype:#?call"></a></li>
                                                                <li class="rss"><a target="_blank" href="#"></a></li>
                                                                <li class="twitter"><a target="_blank" href="#"></a></li>
                                                                <li class="facebook"><a target="_blank" href="#"></a></li>
                                                        </ul>
                                                </div>
                                        </div>
                                </div>
                        </div>
                        <!-- End of Footer Bottom -->

                </footer>
                <!-- End of Footer -->

                <a href="#top" id="scroll-top"></a>

                <!-- script -->
                <%--<script type='text/javascript' src='js/jquery-1.8.3.min.js'></script>--%>
                <script type='text/javascript' src='js/jquery.easing.1.3.js'></script>
                <script type='text/javascript' src='js/prettyphoto/jquery.prettyPhoto.js'></script>
                <script type='text/javascript' src='js/jflickrfeed.js'></script>
                <script type='text/javascript' src='js/jquery.liveSearch.js'></script>
                <script type='text/javascript' src='js/jquery.form.js'></script>
                <script type='text/javascript' src='js/jquery.validate.min.js'></script>
                <script type='text/javascript' src='js/custom.js'></script>

        </body>
</html>
