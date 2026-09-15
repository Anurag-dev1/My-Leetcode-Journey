class Solution {
public:
    int maxNumberOfFamilies(int n, vector<vector<int>>& reservedSeats) {
        unordered_map<int , unordered_set<int>> mp;

        for(auto & reservedSeat : reservedSeats){
            int row = reservedSeat[0];
            int col = reservedSeat[1];

            mp[row].insert(col);
        }

        int res = (n - mp.size())*2;

        for(auto & [row , bookedSeats] : mp){

            auto isAvailable = [&](int seat){
                return bookedSeats.find(seat) == bookedSeats.end();
            };

            bool GroupA = isAvailable(2) &&isAvailable(3) &&isAvailable(5) && isAvailable(4);
            bool GroupB = isAvailable(4) &&isAvailable(5) &&isAvailable(6) && isAvailable(7);
            bool GroupC = isAvailable(8) &&isAvailable(9) &&isAvailable(6) && isAvailable(7);

            if(GroupA && GroupC)
            res += 2;
            else if(GroupA || GroupB || GroupC)
            res += 1;
        }

        return res;
    }
};