public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public Cylinder(){
        super();
        this.height=5;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString(){
        return super.toString()+" , height: "+ this.height;
    }

}
