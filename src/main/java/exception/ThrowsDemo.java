package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo {
    public void doSome() throws IOException, AWTException {}
}
class SbuClass extends ThrowsDemo {
    //public void doSome() throws FileNotFoundException {}//可以不抛 可以抛一部分 可以抛子类 也可以不抛
    //public void doSome() throws Exception {}//不允许抛出异常的超类型异常
    //public void doSome() throws SQLException{}//不允许抛出额外异常
}
