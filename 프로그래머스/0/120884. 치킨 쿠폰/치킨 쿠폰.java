class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupon = chicken%10;
        
        for (int i = chicken/10; i > 0; i = i/10) {
            serviceChicken += i; 
            coupon += i%10;
        };
    
        int serviceCoupon = coupon%10;
        if (coupon/10 > 0) {
            for (int j = coupon/10; j > 0; j = j/10) {
                serviceChicken += j; 
                serviceCoupon += j%10;
            }  
        }
        
        
        return serviceChicken + serviceCoupon/10;
    }
}