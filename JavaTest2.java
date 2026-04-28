import java.util.ArrayList;
import java.util.List;

/**
 * 社員管理クラス
 * 構造化されたデータとリスト処理のテスト用
 */
public class EmployeeManager {

    // 社員データの内部クラス
    public static class Employee {
        private int id;
        private String name;
        private String department;

        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return String.format("ID:%d, Name:%s, Dept:%s", id, name, department);
        }
    }

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(int id, String name, String department) {
        employeeList.add(new Employee(id, name, department));
    }

    public void printAllEmployees() {
        System.out.println("--- 全社員リスト ---");
        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // テスト用データの追加
        manager.addEmployee(101, "佐藤太郎", "営業部");
        manager.addEmployee(102, "鈴木花子", "開発部");
        manager.addEmployee(103, "高橋一郎", "人事部");
        manager.addEmployee(104, "田中次郎", "インフラ部");

        // 出力実行
        manager.printAllEmployees();
    }
}