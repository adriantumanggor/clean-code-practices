public class Manager {
    EmployeeData employeeData;

    public Manager(String nama, int gajiPerJam, int jamKerja) {
        this.employeeData = new EmployeeData(nama, gajiPerJam, jamKerja);
    }

    public void hitungTotalGaji() {
        System.out.println("ManagerName:" + getName() + "->" + employeeData.getTotalGaji());
    }

    public String getName() {
        return employeeData.nama;
    }
}
