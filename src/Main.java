public class Main {
    public static void main(String[] args)
    {
        Department salesDepartment = new SalesDepartment(1, "Sales Dept");
        Department financialDepartment = new FinancialDepartment(2, "Financial Dept");
        Department hrDepartment = new HRDepartment(3, "HR Dept");

        HeadDepartment regionalDepartment = new HeadDepartment(4, "Regional Department");

        regionalDepartment.addDepartment(financialDepartment);
        regionalDepartment.addDepartment(salesDepartment);
        regionalDepartment.addDepartment(hrDepartment);

        HeadDepartment headDepartment = new HeadDepartment(5, "Head Dept");
        headDepartment.addDepartment(regionalDepartment);
        headDepartment.printDepartmentName();
    }
}