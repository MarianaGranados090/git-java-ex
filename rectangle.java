public class rectangle {
    private int height;
    private int width;

    //constructor: method that runs when we create a new object
//they are used to initialize the object and set valid values

    public rectangle(int h, int w){
        //no return type
        //height = h;
       // width = w;
        setWidth(w);
        setHeight(h);
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea()
    {
        return height * width;
    }
}
