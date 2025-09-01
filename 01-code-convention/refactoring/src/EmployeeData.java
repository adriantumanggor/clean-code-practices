public class EmployeeData {
    public String nama;
    public int jamKerja;
    public int gajiPerJam;
    public int totalGaji;

    public EmployeeData (){}

    public EmployeeData (String nama, int gajiPerJam, int jamKerja){
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.jamKerja = jamKerja;
        this.totalGaji = hitungTotalGaji(jamKerja, gajiPerJam);
    }

    public void cetakTotalGaji(String nama, int gajiPerJam, int jamKerja) {
        System.out.println("nama:" + nama + " gaji = " + hitungTotalGaji(jamKerja, gajiPerJam));
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    private int hitungTotalGaji(int jamKerja, int gajiPerJam) {
        return jamKerja * gajiPerJam;
    }
}
