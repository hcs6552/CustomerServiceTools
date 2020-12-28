package cn.emay.custom.config;

import com.sun.javafx.applet.Splash;
import de.felixroske.jfxsupport.SplashScreen;

/**
 * 描述：〈配置启动图片〉
 *
 * @author Hcs
 * @create 2020/12/27
 */
public class CustomSplash extends SplashScreen {

    @Override
    public String getImagePath() {
        return "/image/Emay.png";
    }

    @Override
    public boolean visible() {
        return super.visible();
    }
}
