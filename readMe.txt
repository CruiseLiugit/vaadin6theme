说明：
今天看了 Vaadin 的 Add-one 。考虑选择哪一个版本的
主要困惑问题是，样式如何实现。这里有个例子实验一下

Vaadin 6.2+
https://vaadin.com/directory#addon/vaadin-chameleon-theme

public MyApp extends Application {

    public void init() {
        setTheme("chameleon-blue");
        ...
        Button button = new Button("Style me");
        button.addStyleName(ChameleonTheme.BUTTON_BIG);
        button.addStyleName(ChameleonTheme.BUTTON_WIDE);
        button.addStyleName(ChameleonTheme.BUTTON_DEFAULT);
    }

}

步骤：
1、下载
2、把所有 jar 文件添加到项目中
3、调用

注意：跟官网下载的一样，由一个核心 jar(vaadin-chameleon-theme-1.0.2.jar) 文件
和一些 不同颜色的样式jar 文件组成(chameleon-blue.jar、chameleon-dark.jar、chameleon-green.jar、chameleon-vaadin.jar、)

发现：
1、插件包里面有这样的样式
  import com.vaadin.addon.chameleon.ChameleonTheme;
2、官方 UI 包里面也有这样的样式
  import com.vaadin.ui.themes.ChameleonTheme;
  
接下来可以测试一下 Vaadin 7 
  



