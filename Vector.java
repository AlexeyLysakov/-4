public class Vector
{
    private int x;
    private int y;
    private int z;

    public void Vector(int a1, int b1, int c1, int a2, int b2, int c2)
    {
        x = a2 - a1;
        y = b2 - b1;
        z = c2 - c1;
    }

    @Override
    public String toString()
    {
        return "{" + x + ";" + y + ";" + z + "}";
    }

    public void sum(int x1, int y1, int z1)
    {
        x += x1;
        y += y1;
        z += z1;
    }

    public void subtraction(int x1, int y1, int z1)
    {
        x -= x1;
        y -= y1;
        z -= z1;
    }

    public int scalarProduct(int x1, int y1, int z1)
    {
        int ScalarProduct = x * x1 + y * y1 + z * z1;
        return ScalarProduct;
    }

    public double sizeVector()
    {
        double SizeVector = Math.sqrt(x * x + y * y + z * z);
        return SizeVector;
    }

    private double cos(int x1, int y1, int z1)
    {
        double size_1 = Math.sqrt(x * x + y * y + z * z);
        double size_2 = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
        if (size_1 == 0 || size_2 == 0)
        {
            throw new ArithmeticException("size_1 == 0 || size_2 == 0");
        }
        double cos = (x * x1 + y * y1 + z * z1) / (size_1 * size_2);
        return cos;
    }
}
