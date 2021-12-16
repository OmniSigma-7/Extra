
package bsu.comp152;

class model {
    private final int uleftX;
    public int upperLeftX;
    public int upperLeftY;
    public int lowerRightX;
    public int lowerRightY;
    public model(int uleftX, int uleftY, int lRightX, int lRightY){
        this.uleftX = uleftX;
        upperLeftX = this.uleftX;
        upperLeftY = uleftY;
        lowerRightX = lRightX;
        lowerRightY = lRightY;
    }

    /**
     *
     * @param other -another rectangle
     * @return should return true if this rectangle overlaps/intersections with the other rectangle
     */
    public boolean doesHit(model other){
        if (this.upperLeftY > other.lowerRightY && other.upperLeftY > this.lowerRightY)
            return false;
        if (this.upperLeftX>other.lowerRightX || other.upperLeftX > this.lowerRightX)
            return false;
        return true;
    }
}
// I think what went wrong was the upperleft and lowerright objects. I think it has something to do with the " ||" and
// "&&" in the functions