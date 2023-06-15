package Test;

import java.util.HashMap;
import java.util.Scanner;

class Worker{
    private int workerId;
    private String name;
    private String dept;
    private String addr;
    private int birth;

    public Worker(int workerId, String name, String dept, String addr, int birth) {
        this.workerId = workerId;
        this.name = name;
        this.dept = dept;
        this.addr = addr;
        this.birth = birth;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}

class WorkersManagementProgram {
    HashMap<Integer, Worker> workers = new HashMap<>();

    public void show() {
        Scanner s = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            Menu();
            choice = s.nextInt();
            s.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    addWorker(s);
                    break;
                case 2:
                    searchWorker(s);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }

            System.out.println();
        }

        s.close();
    }

    private void Menu() {
        System.out.println("========= 사원 정보 관리 프로그램 =========");
        System.out.println("1. 사원 정보 입력");
        System.out.println("2. 사원 정보 개별 조회");
        System.out.println("3. 프로그램 종료");
        System.out.print("메뉴 선택: ");
    }

    private void addWorker(Scanner s) {
        System.out.print("사번: ");
        int workerId = s.nextInt();
        s.nextLine(); // 버퍼 비우기

        System.out.print("이름: ");
        String name = s.nextLine();

        System.out.print("부서: ");
        String dept = s.nextLine();

        System.out.print("집주소: ");
        String addr = s.nextLine();

        System.out.print("생일: ");
        int birth = s.nextInt();
        s.nextLine(); // 버퍼 비우기

        Worker worker = new Worker(workerId, name, dept, addr, birth);
        workers.put(workerId, worker);

        System.out.println("사원 정보가 입력되었습니다.");
    }

    private void searchWorker(Scanner s) {
        System.out.print("사번 입력: ");
        int workerId = s.nextInt();
        s.nextLine(); // 버퍼 비우기

        Worker worker = workers.get(workerId);

        if (worker != null) {
            System.out.println("이름: " + worker.getName());
            System.out.println("부서: " + worker.getDept());
            System.out.println("주소: " + worker.getAddr());
            System.out.println("생일: " + worker.getBirth());
        } else
            System.out.println("없는 직원입니다.");
    }
}


public class fourth_2 {
    public static void main(String[] args) {

        WorkersManagementProgram program = new WorkersManagementProgram();
        program.show();
    }

}
