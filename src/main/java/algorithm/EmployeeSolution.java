package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}


public class EmployeeSolution {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    /**
     * 1.这道题分析之后发现数据结构明显是树。需求就是给定一棵树，以及一棵树中的一个节点，求这个节点和对应的子树的权重（员工的重要性）之和
     * <p>
     * 2.list 的数据结构无法方便的根据 id 取得对应的 employee 节点，所以我们将 list 转化为 map
     * <p>
     * 3.数据结构中每个节点都存储子节点的 id，因此树形结构的节点关联关系就有了。
     * <p>
     * 3.递归（深度优先搜索）计算当前节点的重要性
     *
     * @param employees 公司的员工信息
     * @param id        其中一个员工id
     * @return 对应员工的重要性
     */
    public int getImportance(List<Employee> employees, int id) {

        // 将数据放到 map 中
        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int eid) {
        Employee employee = employeeMap.get(eid);
        int answer = employee.importance;
        for (int id : employee.subordinates) {
            answer += dfs(id);
        }
        return answer;
    }

    public static void main(String[] args) {
        // [[1,5,[2,3]],[2,3,[4]],[3,4,[]],[4,1,[]]]
        List<Employee> employeeList = new ArrayList<>();

        List<Integer> e11 = new ArrayList<>();
        e11.add(2);
        e11.add(3);
        Employee e1 = new Employee(1, 5, e11);
        employeeList.add(e1);

        List<Integer> e22 = new ArrayList<>();
        e22.add(4);
        Employee e2 = new Employee(2, 3, e22);
        employeeList.add(e2);

        Employee e3 = new Employee(3, 4, new ArrayList<>());
        employeeList.add(e3);

        Employee e4 = new Employee(4, 1, new ArrayList<>());
        employeeList.add(e4);

        EmployeeSolution solution = new EmployeeSolution();
        System.out.println(solution.getImportance(employeeList, 1));
    }
}
