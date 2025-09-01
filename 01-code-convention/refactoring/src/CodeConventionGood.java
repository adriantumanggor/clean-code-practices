public class CodeConventionGood {
    public static void main(String[] args) {
        System.out.println("PROGRAM HITUNG GAJI ===>\n");
        
        EmployeeData employeeData = new EmployeeData();
        employeeData.cetakTotalGaji("budi", 40, 50000);
        employeeData.cetakTotalGaji("ANI", 38, 45000);

        Manager manager = new Manager("toni", 60000, 45);
        manager.hitungTotalGaji();
    }

}
