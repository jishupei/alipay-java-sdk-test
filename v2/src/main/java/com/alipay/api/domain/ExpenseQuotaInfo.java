package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度信息
 *
 * @author auto create
 * @since 1.0, 2022-11-03 22:27:55
 */
public class ExpenseQuotaInfo extends AlipayObject {

	private static final long serialVersionUID = 5192143351233622382L;

	/**
	 * 额度失效时间
	 */
	@ApiField("effective_end_date")
	private Date effectiveEndDate;

	/**
	 * 额度生效时间
	 */
	@ApiField("effective_start_date")
	private Date effectiveStartDate;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 额度是否冻结，冻结后因公付不可用
	 */
	@ApiField("freeze")
	private Boolean freeze;

	/**
	 * 额度所属者ID
owner_type为EMPLOYEE时为员工支付宝ID
owner_type为ENTERPRISE_PAY_UID时为员工企业码ID
owner_type为PHONE时为员工手机号
owner_type为ENTERPRISE时为企业ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 额度所属者id类型
EMPLOYEE 员工
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 可用金额（单位分）
	 */
	@ApiField("quota_available")
	private String quotaAvailable;

	/**
	 * 额度ID
	 */
	@ApiField("quota_id")
	private String quotaId;

	/**
	 * 锁定金额（单位分）
	 */
	@ApiField("quota_locked")
	private String quotaLocked;

	/**
	 * 总金额（单位分）
	 */
	@ApiField("quota_total")
	private String quotaTotal;

	/**
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/**
	 * 已用金额（单位分）
	 */
	@ApiField("quota_used")
	private String quotaUsed;

	/**
	 * 额度维度ID
当 target_type=EXPENSE_TYPE 时，值为
MEAL（工作餐）
当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID
当target_type=INSTITUTION 时，值为制度ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 额度维度
枚举值：
EXPENSE_TYPE（费用类型维度），
RULE_GROUP_AGGREGATION（规则聚合维度）,
INSTITUTION（制度）
	 */
	@ApiField("target_type")
	private String targetType;

	public Date getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Date getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Boolean getFreeze() {
		return this.freeze;
	}
	public void setFreeze(Boolean freeze) {
		this.freeze = freeze;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getQuotaAvailable() {
		return this.quotaAvailable;
	}
	public void setQuotaAvailable(String quotaAvailable) {
		this.quotaAvailable = quotaAvailable;
	}

	public String getQuotaId() {
		return this.quotaId;
	}
	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

	public String getQuotaLocked() {
		return this.quotaLocked;
	}
	public void setQuotaLocked(String quotaLocked) {
		this.quotaLocked = quotaLocked;
	}

	public String getQuotaTotal() {
		return this.quotaTotal;
	}
	public void setQuotaTotal(String quotaTotal) {
		this.quotaTotal = quotaTotal;
	}

	public String getQuotaType() {
		return this.quotaType;
	}
	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public String getQuotaUsed() {
		return this.quotaUsed;
	}
	public void setQuotaUsed(String quotaUsed) {
		this.quotaUsed = quotaUsed;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
