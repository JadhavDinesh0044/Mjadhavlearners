package simpli;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Camera {
    private String cameraId;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available;

    public Camera(String cameraId, String brand, String model, double pricePerDay) {
        this.cameraId = cameraId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public String getCameraId() {
        return cameraId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class User {
    private String username;
    private String password;
    private double walletBalance;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.walletBalance = 0.0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}

public class CameraRentalApp {
    private static List<Camera> cameraList = new ArrayList<>();
    private static User currentUser;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create some sample cameras
        cameraList.add(new Camera("001", "Canon", "EOS R5", 20.0));
        cameraList.add(new Camera("002", "Nikon", "Z7 II", 25.0));
        cameraList.add(new Camera("003", "Sony", "A7R IV", 30.0));

        // Start the application
        login();
        showMenu();
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if username and password are valid
        // For simplicity, we're using a single hardcoded user
        if (username.equals("user") && password.equals("password")) {
            currentUser = new User(username, password);
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1) My camera");
            System.out.println("2) Rent a camera");
            System.out.println("3) View all cameras");
            System.out.println("4) My wallet");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    showMyCameraMenu();
                    break;
                case 2:
                    rentCamera();
                    break;
                case 3:
                    viewAllCameras();
                    break;
                case 4:
                    showWalletMenu();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void showMyCameraMenu() {
        int choice;
        do {
            System.out.println("\n--- My Camera ---");
            System.out.println("1) Add");
            System.out.println("2) Remove");
            System.out.println("3) View my cameras");
            System.out.println("4) Go to previous menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addCamera();
                    break;
                case 2:
                    removeCamera();
                    break;
                case 3:
                    viewMyCameras();
                    break;
                case 4:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void addCamera() {
        System.out.print("Enter camera brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter camera model: ");
        String model = scanner.nextLine();

        System.out.print("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        String cameraId = String.format("%03d", cameraList.size() + 1); // Generate a unique camera ID

        Camera camera = new Camera(cameraId, brand, model, pricePerDay);
        cameraList.add(camera);

        System.out.println("Camera added successfully!");
    }

    private static void removeCamera() {
        System.out.print("Enter camera ID to remove: ");
        String cameraId = scanner.nextLine();

        boolean removed = false;
        for (Camera camera : cameraList) {
            if (camera.getCameraId().equals(cameraId)) {
                cameraList.remove(camera);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Camera removed successfully!");
        } else {
            System.out.println("Camera not found.");
        }
    }

    private static void viewMyCameras() {
        System.out.println("\n--- My Cameras ---");
        System.out.printf("%-10s %-10s %-20s %-10s %-10s%n", "Camera ID", "Brand", "Model", "Price/Day", "Status");
        for (Camera camera : cameraList) {
            System.out.printf("%-10s %-10s %-20s %-10.2f %-10s%n",
                    camera.getCameraId(), camera.getBrand(), camera.getModel(),
                    camera.getPricePerDay(), camera.isAvailable() ? "Available" : "Rented");
        }
    }

    private static void rentCamera() {
        System.out.println("\n--- Available Cameras ---");
        System.out.printf("%-10s %-10s %-20s %-10s%n", "Camera ID", "Brand", "Model", "Price/Day");
        for (Camera camera : cameraList) {
            if (camera.isAvailable()) {
                System.out.printf("%-10s %-10s %-20s %-10.2f%n",
                        camera.getCameraId(), camera.getBrand(), camera.getModel(), camera.getPricePerDay());
            }
        }

        System.out.print("Enter camera ID to rent: ");
        String cameraId = scanner.nextLine();

        Camera selectedCamera = null;
        for (Camera camera : cameraList) {
            if (camera.getCameraId().equals(cameraId)) {
                selectedCamera = camera;
                break;
            }
        }

        if (selectedCamera != null && selectedCamera.isAvailable()) {
            if (selectedCamera.getPricePerDay() > currentUser.getWalletBalance()) {
                System.out.println("Insufficient balance. Cannot rent the camera.");
            } else {
                selectedCamera.setAvailable(false);
                currentUser.setWalletBalance(currentUser.getWalletBalance() - selectedCamera.getPricePerDay());
                System.out.println("Camera rented successfully!");

                // Display transaction details
                System.out.println("--- Transaction Details ---");
                System.out.println("Camera ID: " + selectedCamera.getCameraId());
                System.out.println("Brand: " + selectedCamera.getBrand());
                System.out.println("Model: " + selectedCamera.getModel());
                System.out.println("Price/Day: " + selectedCamera.getPricePerDay());
            }
        } else {
            System.out.println("Invalid camera ID or camera is already rented.");
        }
    }

    private static void viewAllCameras() {
        System.out.println("\n--- All Cameras ---");
        System.out.printf("%-10s %-10s %-20s %-10s %-10s%n", "Camera ID", "Brand", "Model", "Price/Day", "Status");
        for (Camera camera : cameraList) {
            System.out.printf("%-10s %-10s %-20s %-10.2f %-10s%n",
                    camera.getCameraId(), camera.getBrand(), camera.getModel(),
                    camera.getPricePerDay(), camera.isAvailable() ? "Available" : "Rented");
        }
    }

    private static void showWalletMenu() {
        System.out.println("\n--- My Wallet ---");
        System.out.println("Current balance: " + currentUser.getWalletBalance());

        System.out.print("Do you want to add more amount to your wallet? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the amount to add: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            currentUser.setWalletBalance(currentUser.getWalletBalance() + amount);
            System.out.println("Amount added successfully!");
        }
    }
}


