import java.awt.*;

public class ImageProxy implements Element,Picture{

    public Image realImage = null;
    public String src;

    public ImageProxy(String src) {
        this.src = src;
    }

    public Image loadImage() {
        // String tmp = realImage.toString().substring(3).toUpperCase();
        if (realImage == null)
            realImage = new Image(this.src);

        return realImage;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
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
