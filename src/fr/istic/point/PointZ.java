package fr.istic.point;

public class PointZ extends PointColor {
  double z;

  public PointZ(double x, double y, double z, Color c) {
    super(x, y, c);
    this.z = z;
  }

  @Override
  public String toString() {
    return super.toString() + "[z=" + z + "]";
  }
}
