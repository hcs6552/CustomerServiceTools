package cn.customer;

import cn.customer.config.CustomSplash;
import cn.customer.view.IndexView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("客服工具");
        primaryStage.getIcons().add(new Image("/image/favicon/favicon-16.jpg"));
        primaryStage.getIcons().add(new Image("/image/favicon/favicon-32.jpg"));
        primaryStage.getIcons().add(new Image("/image/favicon/favicon-64.jpg"));
        primaryStage.getIcons().add(new Image("/image/favicon/favicon-128.jpg"));
        primaryStage.getIcons().add(new Image("/image/favicon/favicon-256.jpg"));
        super.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(App.class, IndexView.class, new CustomSplash(),args);
    }
}
