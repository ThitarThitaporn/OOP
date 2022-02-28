public class Rectangle
    extends GeometricObject implements Comparable<Rectangle> {
        private double width;
        private double height;

        Rectangle(){
            super();
        }

        Rectangle(double width, double height){
            super();
            this.width = width;
            this.height = height;
        }

        public double getWidth(){
            return width;
        }

        public double getHeight(){
            return height;
        }

        public void setWidth(double width){
            this.width = width;
        }

        public void setHeight(double height){
            this.height = height;
        }

        public double getArea(){
            return width*height;
        }

        public double getPerimeter(){
            return (width + height)*2;
        }

        public boolean equals(Rectangle o){
            return(this.getArea() == o.getArea());
        }

        @Override
        public boolean compareTo(Rectangle o) {
            return (this.equals(o));
        }

    }