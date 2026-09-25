package org.kohsuke.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * A single line of an organization's billing usage report.
 *
 * @see GHBillingUsageReport#getUsageItems()
 */
@SuppressFBWarnings(value = { "UWF_UNWRITTEN_FIELD", "NP_UNWRITTEN_FIELD" }, justification = "JSON API")
public class GHBillingUsageItem {

    private String date;

    // The billing usage API uses camelCase property names, unlike the rest of the API.
    @JsonProperty("discountAmount")
    private double discountAmount;

    @JsonProperty("grossAmount")
    private double grossAmount;

    @JsonProperty("netAmount")
    private double netAmount;

    @JsonProperty("organizationName")
    private String organizationName;

    @JsonProperty("pricePerUnit")
    private double pricePerUnit;

    private String product;

    private long quantity;

    @JsonProperty("repositoryName")
    private String repositoryName;

    private String sku;

    @JsonProperty("unitType")
    private String unitType;

    /**
     * Create default GHBillingUsageItem instance
     */
    public GHBillingUsageItem() {
    }

    /**
     * Gets the date of the usage, as returned by the API.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the discount amount.
     *
     * @return the discount amount
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Gets the gross amount.
     *
     * @return the gross amount
     */
    public double getGrossAmount() {
        return grossAmount;
    }

    /**
     * Gets the net amount.
     *
     * @return the net amount
     */
    public double getNetAmount() {
        return netAmount;
    }

    /**
     * Gets the organization name.
     *
     * @return the organization name
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Gets the price per unit.
     *
     * @return the price per unit
     */
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Gets the product.
     *
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * Gets the quantity.
     *
     * @return the quantity
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Gets the repository name.
     *
     * @return the repository name, or null when the usage is not attributed to a repository
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Gets the SKU.
     *
     * @return the SKU
     */
    public String getSku() {
        return sku;
    }

    /**
     * Gets the unit type.
     *
     * @return the unit type
     */
    public String getUnitType() {
        return unitType;
    }
}
