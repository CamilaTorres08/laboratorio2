public interface ShapeFactory{
    public Shape create(String name){
        switch case(name){
            case "Triangle":
                return new Triangle();
                break;
            case "Quadrilateral":
                return new Quadrilateral();
                break;
            case "Pentagon":
                return new Pentagon();
                break;
            default:
                return new Hexagon();
                break;
        }
    }
}