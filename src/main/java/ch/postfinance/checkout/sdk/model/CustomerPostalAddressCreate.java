/**
* PostFinance Checkout SDK
*
* This library allows to interact with the PostFinance Checkout payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package ch.postfinance.checkout.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import ch.postfinance.checkout.sdk.model.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class CustomerPostalAddressCreate {
  
  @JsonProperty("city")
  protected String city = null;

  
  @JsonProperty("commercialRegisterNumber")
  protected String commercialRegisterNumber = null;

  
  @JsonProperty("country")
  protected String country = null;

  
  @JsonProperty("dateOfBirth")
  protected LocalDate dateOfBirth = null;

  
  @JsonProperty("dependentLocality")
  protected String dependentLocality = null;

  
  @JsonProperty("emailAddress")
  protected String emailAddress = null;

  
  @JsonProperty("familyName")
  protected String familyName = null;

  
  @JsonProperty("gender")
  protected Gender gender = null;

  
  @JsonProperty("givenName")
  protected String givenName = null;

  
  @JsonProperty("legalOrganizationForm")
  protected Long legalOrganizationForm = null;

  
  @JsonProperty("mobilePhoneNumber")
  protected String mobilePhoneNumber = null;

  
  @JsonProperty("organizationName")
  protected String organizationName = null;

  
  @JsonProperty("phoneNumber")
  protected String phoneNumber = null;

  
  @JsonProperty("postalState")
  protected String postalState = null;

  
  @JsonProperty("postcode")
  protected String postcode = null;

  
  @JsonProperty("salesTaxNumber")
  protected String salesTaxNumber = null;

  
  @JsonProperty("salutation")
  protected String salutation = null;

  
  @JsonProperty("socialSecurityNumber")
  protected String socialSecurityNumber = null;

  
  @JsonProperty("sortingCode")
  protected String sortingCode = null;

  
  @JsonProperty("street")
  protected String street = null;

  
  
  public CustomerPostalAddressCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public CustomerPostalAddressCreate commercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
    return this;
  }

   /**
   * 
   * @return commercialRegisterNumber
  **/
  @ApiModelProperty(value = "")
  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }

  public void setCommercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
  }

  
  public CustomerPostalAddressCreate country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public CustomerPostalAddressCreate dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  public CustomerPostalAddressCreate dependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
    return this;
  }

   /**
   * 
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "")
  public String getDependentLocality() {
    return dependentLocality;
  }

  public void setDependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  
  public CustomerPostalAddressCreate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public CustomerPostalAddressCreate familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public CustomerPostalAddressCreate gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  
  public CustomerPostalAddressCreate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  public CustomerPostalAddressCreate legalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
    return this;
  }

   /**
   * 
   * @return legalOrganizationForm
  **/
  @ApiModelProperty(value = "")
  public Long getLegalOrganizationForm() {
    return legalOrganizationForm;
  }

  public void setLegalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
  }

  
  public CustomerPostalAddressCreate mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * 
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  
  public CustomerPostalAddressCreate organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * 
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  public CustomerPostalAddressCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  public CustomerPostalAddressCreate postalState(String postalState) {
    this.postalState = postalState;
    return this;
  }

   /**
   * 
   * @return postalState
  **/
  @ApiModelProperty(value = "")
  public String getPostalState() {
    return postalState;
  }

  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  
  public CustomerPostalAddressCreate postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * 
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  
  public CustomerPostalAddressCreate salesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

   /**
   * 
   * @return salesTaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }

  public void setSalesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  
  public CustomerPostalAddressCreate salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * 
   * @return salutation
  **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  public CustomerPostalAddressCreate socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  
  public CustomerPostalAddressCreate sortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

   /**
   * The sorting code identifies the post office at which the post box is located in.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifies the post office at which the post box is located in.")
  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

  
  public CustomerPostalAddressCreate street(String street) {
    this.street = street;
    return this;
  }

   /**
   * 
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPostalAddressCreate customerPostalAddressCreate = (CustomerPostalAddressCreate) o;
    return Objects.equals(this.city, customerPostalAddressCreate.city) &&
        Objects.equals(this.commercialRegisterNumber, customerPostalAddressCreate.commercialRegisterNumber) &&
        Objects.equals(this.country, customerPostalAddressCreate.country) &&
        Objects.equals(this.dateOfBirth, customerPostalAddressCreate.dateOfBirth) &&
        Objects.equals(this.dependentLocality, customerPostalAddressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, customerPostalAddressCreate.emailAddress) &&
        Objects.equals(this.familyName, customerPostalAddressCreate.familyName) &&
        Objects.equals(this.gender, customerPostalAddressCreate.gender) &&
        Objects.equals(this.givenName, customerPostalAddressCreate.givenName) &&
        Objects.equals(this.legalOrganizationForm, customerPostalAddressCreate.legalOrganizationForm) &&
        Objects.equals(this.mobilePhoneNumber, customerPostalAddressCreate.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, customerPostalAddressCreate.organizationName) &&
        Objects.equals(this.phoneNumber, customerPostalAddressCreate.phoneNumber) &&
        Objects.equals(this.postalState, customerPostalAddressCreate.postalState) &&
        Objects.equals(this.postcode, customerPostalAddressCreate.postcode) &&
        Objects.equals(this.salesTaxNumber, customerPostalAddressCreate.salesTaxNumber) &&
        Objects.equals(this.salutation, customerPostalAddressCreate.salutation) &&
        Objects.equals(this.socialSecurityNumber, customerPostalAddressCreate.socialSecurityNumber) &&
        Objects.equals(this.sortingCode, customerPostalAddressCreate.sortingCode) &&
        Objects.equals(this.street, customerPostalAddressCreate.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postalState, postcode, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPostalAddressCreate {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalOrganizationForm: ").append(toIndentedString(legalOrganizationForm)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

