public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; 
    }

    // Method to validate if all OTPs generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; 

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate if all OTPs are unique
        boolean unique = areOTPsUnique(otps);

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
