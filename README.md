# company-structure-simulation-with-composite-pattern

This project is a Java implementation of a company structure simulation utilizing the Composite design pattern. In this simulation, various department classes are created to represent different components of a company hierarchy. The Composite pattern is employed to treat individual departments and higher-level structures uniformly.

## Project Components

1. **Department.java (Interface):**
   - Defines the `printDepartmentName()` method, which will be implemented by various department classes.

2. **FinancialDepartment.java (Leaf):**
   - Implements the `Department` interface.
   - Contains fields for an integer ID and a string name.
   - Includes a constructor to initialize the fields.
   - Implements `printDepartmentName()` using `getClass().getSimpleName()`.

3. **SalesDepartment.java (Leaf):**
   - Similar to `FinancialDepartment`, implements the `Department` interface.

4. **HRDepartment.java (Leaf):**
   - Similar to `FinancialDepartment`, implements the `Department` interface.

5. **HeadDepartment.java (Composite):**
   - Implements the `Department` interface.
   - Contains fields for an integer ID, a string name, and a list of `Department` objects.
   - Includes a constructor to initialize the fields and instantiate the department list.
   - Provides methods `addDepartment()` and `removeDepartment()` to manage the list of departments.
   - Implements `printDepartmentName()` to print its name and the names of its child departments.

6. **Main.java:**
   - Contains test cases to demonstrate the functionality of the implemented classes.
   - Creates instances of various departments, including leaves (`FinancialDepartment`, `SalesDepartment`, `HRDepartment`) and a composite (`HeadDepartment`).
   - Demonstrates the use of the `addDepartment()` method to build a hierarchical structure.
   - Calls `printDepartmentName()` on the `HeadDepartment` object to visualize the simulated company structure.

