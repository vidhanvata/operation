//package in.testingInSpring.operation.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Table(name = "auth_role")
//public class AuthRole implements Serializable {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "r_id")
//	private int roleId;
//	
//	@Column(name = "r_name")
//	private String roleName;
//	
//	@Column(name = "r_role_desc")
//	private String roleDesc;
//	
//	
//	public int getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(int roleId) {
//		this.roleId = roleId;
//	}
//	public String getRoleName() {
//		return roleName;
//	}
//	public void setRoleName(String roleName) {
//		this.roleName = roleName;
//	}
//	public String getRoleDesc() {
//		return roleDesc;
//	}
//	public void setRoleDesc(String roleDesc) {
//		this.roleDesc = roleDesc;
//	}	
//	
//}
