// Last updated: 9/15/2026, 4:15:45 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int extraFuel = Math.min((mainTank - 1) / 4, additionalTank);
        return (mainTank + extraFuel) * 10;
    }
}
