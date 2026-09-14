class Solution {
public:
    bool isRectangleOverlap(vector<int>& a, vector<int>& b) {
        if(a[0] >= b[2] || b[0] >= a[2] ||b[1] >= a[3] || a[1] >= b[3])
        return false;

        return true;
    }
};