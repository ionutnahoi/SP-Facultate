public class Image {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public void print(Image image) {
        System.out.println("Image: " + image.image);
    }
}
