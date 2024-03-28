package chat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatRoomGUI extends Application {

    private TextArea chatArea;
    private TextField messageField;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // 聊天消息显示区域
        chatArea = new TextArea();
        chatArea.setEditable(false);
        root.setCenter(chatArea);

        // 输入消息区域
        messageField = new TextField();
        messageField.setPromptText("输入消息...");
        Button sendButton = new Button("发送");
        sendButton.setOnAction(e -> sendMessage());
        VBox inputBox = new VBox(10, messageField, sendButton);
        inputBox.setPadding(new Insets(10));
        root.setBottom(inputBox);

        // 创建场景
        Scene scene = new Scene(root, 400, 300);

        // 设置舞台
        primaryStage.setTitle("聊天室");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 发送消息的方法
    private void sendMessage() {
        String message = messageField.getText();
        // 在聊天区域显示消息
        chatArea.appendText("我: " + message + "\n");
        // 清空消息输入框
        messageField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
