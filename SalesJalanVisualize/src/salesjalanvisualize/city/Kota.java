/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesjalanvisualize.city;

import javafx.geometry.Point2D;

/**
 *
 * @author rfachrur
 */
public class Kota implements Comparable<Kota> {
    
    private final Point2D location;
    
    public Kota(double x, double y) { this.location = new Point2D(x, y); }

    @Override
    public int compareTo(Kota o) { return (int) this.getLocation().distance(o.getLocation()); }

    public int distanceTo(Kota o) { return (int) this.getLocation().distance(o.getLocation()); }

    // get location in 2D points form
    public Point2D getLocation() { return location; }

    @Override
    public String toString() { return location.toString(); }

}
