public class Circle { private double radius; private double area;
    private String color;
    public Circle(double radius, String color){ setRadius(radius); setColor(color);
    }
    public double getRadius(){ return radius;
    }
    public void setRadius(double radius){ this.radius=radius;
    }
    public double getArea(){ return (radius*3.14)*2;
    }
    public void setArea(double area){ this.area=area;
    }
    public String getColor(){ return color;
    }
    public void setColor(String color){ this.color=color;

    }
}