class Solution {
    public boolean checkOverlap(int r, int xC, int yC, int x1, int y1, int x2, int y2) {
        int x = Math.max(x1, Math.min(xC , x2)) - xC;
        int y = Math.max(y1, Math.min(yC , y2)) - yC;

        int AreaOfRec = x*x + y*y;
        int AreaOfCir = r*r;

        if(AreaOfRec <= AreaOfCir)
        return true;
        
        return false;
    }
}