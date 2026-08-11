// Last updated: 8/11/2026, 2:47:30 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int extraFuel = Math.min((mainTank - 1) / 4, additionalTank);
        return (mainTank + extraFuel) * 10;
    }
}
