package cn.customer;

import cn.customer.config.CustomSplash;
import cn.customer.view.IndexView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport {

    @Override
    public void start(Stage primaryStage) throws Exception{
        super.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(App.class, IndexView.class, new CustomSplash(),args);
    }
}
