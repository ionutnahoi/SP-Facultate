import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}
