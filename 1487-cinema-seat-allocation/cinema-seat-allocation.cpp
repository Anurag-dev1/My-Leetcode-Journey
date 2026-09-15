class Solution {
public:
    int maxNumberOfFamilies(int n, vector<vector<int>>& reservedSeats) {
        unordered_map<int , int> mp;

        for(auto & reservedSeat : reservedSeats){
            int row = reservedSeat[0];
            int seat = reservedSeat[1];

            mp[row] |= (1 << seat);
        }

        int res = (n - mp.size())*2;

        int maskA = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
        int maskB = (1 << 7) | (1 << 6) | (1 << 4) | (1 << 5);
        int maskC = (1 << 8) | (1 << 9) | (1 << 6) | (1 << 7);

        for(auto & [row , bookedSeatsMask] : mp){

            bool GroupA = (bookedSeatsMask & maskA) == 0;
            bool GroupB = (bookedSeatsMask & maskB) == 0;
            bool GroupC = (bookedSeatsMask & maskC) == 0;

            if(GroupA && GroupC)
            res += 2;
            else if(GroupA || GroupB || GroupC)
            res += 1;
        }

        return res;
    }
};