/*
 * Channel Manager REST API
 * Channel Manager REST API. You can find out more about Channel Manager [here](https://www.bokun.io/sell/channel-manager).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bokun.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.bokun.inventory.plugin.api.rest;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.bokun.inventory.plugin.api.rest.BookingType;
import io.bokun.inventory.plugin.api.rest.ContactField;
import io.bokun.inventory.plugin.api.rest.Extra;
import io.bokun.inventory.plugin.api.rest.MeetingType;
import io.bokun.inventory.plugin.api.rest.OpeningHours;
import io.bokun.inventory.plugin.api.rest.PickupDropoffPlace;
import io.bokun.inventory.plugin.api.rest.PricingCategory;
import io.bokun.inventory.plugin.api.rest.ProductCategory;
import io.bokun.inventory.plugin.api.rest.Rate;
import io.bokun.inventory.plugin.api.rest.SeasonalOpeningHourSet;
import io.bokun.inventory.plugin.api.rest.TicketSupport;
import io.bokun.inventory.plugin.api.rest.TicketType;
import io.bokun.inventory.plugin.api.rest.Time;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductDescription
 */

public class ProductDescription {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("pricingCategories")
  private List<PricingCategory> pricingCategories = new ArrayList<PricingCategory>();

  @SerializedName("rates")
  private List<Rate> rates = new ArrayList<Rate>();

  @SerializedName("allYearOpeningHours")
  private OpeningHours allYearOpeningHours = null;

  @SerializedName("seasonalOpeningHours")
  private SeasonalOpeningHourSet seasonalOpeningHours = null;

  @SerializedName("bookingType")
  private BookingType bookingType = null;

  @SerializedName("customPickupPlaceAllowed")
  private Boolean customPickupPlaceAllowed = null;

  @SerializedName("pickupMinutesBefore")
  private Integer pickupMinutesBefore = null;

  @SerializedName("pickupPlaces")
  private List<PickupDropoffPlace> pickupPlaces = null;

  @SerializedName("dropoffAvailable")
  private Boolean dropoffAvailable = null;

  @SerializedName("customDropoffPlaceAllowed")
  private Boolean customDropoffPlaceAllowed = null;

  @SerializedName("dropoffPlaces")
  private List<PickupDropoffPlace> dropoffPlaces = null;

  @SerializedName("productCategory")
  private ProductCategory productCategory = null;

  @SerializedName("ticketSupport")
  private List<TicketSupport> ticketSupport = new ArrayList<TicketSupport>();

  @SerializedName("countries")
  private List<String> countries = null;

  @SerializedName("cities")
  private List<String> cities = null;

  @SerializedName("startTimes")
  private List<Time> startTimes = null;

  @SerializedName("ticketType")
  private TicketType ticketType = null;

  @SerializedName("meetingType")
  private MeetingType meetingType = null;

  @SerializedName("enforcedLeadPassengerFields")
  private List<ContactField> enforcedLeadPassengerFields = null;

  @SerializedName("enforcedTravellerFields")
  private List<ContactField> enforcedTravellerFields = null;

  @SerializedName("extras")
  private List<Extra> extras = null;

  public ProductDescription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductDescription description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductDescription pricingCategories(List<PricingCategory> pricingCategories) {
    this.pricingCategories = pricingCategories;
    return this;
  }

  public ProductDescription addPricingCategoriesItem(PricingCategory pricingCategoriesItem) {
    this.pricingCategories.add(pricingCategoriesItem);
    return this;
  }

   /**
   * Get pricingCategories
   * @return pricingCategories
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PricingCategory> getPricingCategories() {
    return pricingCategories;
  }

  public void setPricingCategories(List<PricingCategory> pricingCategories) {
    this.pricingCategories = pricingCategories;
  }

  public ProductDescription rates(List<Rate> rates) {
    this.rates = rates;
    return this;
  }

  public ProductDescription addRatesItem(Rate ratesItem) {
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Get rates
   * @return rates
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Rate> getRates() {
    return rates;
  }

  public void setRates(List<Rate> rates) {
    this.rates = rates;
  }

  public ProductDescription allYearOpeningHours(OpeningHours allYearOpeningHours) {
    this.allYearOpeningHours = allYearOpeningHours;
    return this;
  }

   /**
   * Get allYearOpeningHours
   * @return allYearOpeningHours
  **/
  @ApiModelProperty(value = "")
  public OpeningHours getAllYearOpeningHours() {
    return allYearOpeningHours;
  }

  public void setAllYearOpeningHours(OpeningHours allYearOpeningHours) {
    this.allYearOpeningHours = allYearOpeningHours;
  }

  public ProductDescription seasonalOpeningHours(SeasonalOpeningHourSet seasonalOpeningHours) {
    this.seasonalOpeningHours = seasonalOpeningHours;
    return this;
  }

   /**
   * Get seasonalOpeningHours
   * @return seasonalOpeningHours
  **/
  @ApiModelProperty(value = "")
  public SeasonalOpeningHourSet getSeasonalOpeningHours() {
    return seasonalOpeningHours;
  }

  public void setSeasonalOpeningHours(SeasonalOpeningHourSet seasonalOpeningHours) {
    this.seasonalOpeningHours = seasonalOpeningHours;
  }

  public ProductDescription bookingType(BookingType bookingType) {
    this.bookingType = bookingType;
    return this;
  }

   /**
   * Get bookingType
   * @return bookingType
  **/
  @ApiModelProperty(required = true, value = "")
  public BookingType getBookingType() {
    return bookingType;
  }

  public void setBookingType(BookingType bookingType) {
    this.bookingType = bookingType;
  }

  public ProductDescription customPickupPlaceAllowed(Boolean customPickupPlaceAllowed) {
    this.customPickupPlaceAllowed = customPickupPlaceAllowed;
    return this;
  }

   /**
   * Get customPickupPlaceAllowed
   * @return customPickupPlaceAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean getCustomPickupPlaceAllowed() {
    return customPickupPlaceAllowed;
  }

  public void setCustomPickupPlaceAllowed(Boolean customPickupPlaceAllowed) {
    this.customPickupPlaceAllowed = customPickupPlaceAllowed;
  }

  public ProductDescription pickupMinutesBefore(Integer pickupMinutesBefore) {
    this.pickupMinutesBefore = pickupMinutesBefore;
    return this;
  }

   /**
   * Get pickupMinutesBefore
   * @return pickupMinutesBefore
  **/
  @ApiModelProperty(value = "")
  public Integer getPickupMinutesBefore() {
    return pickupMinutesBefore;
  }

  public void setPickupMinutesBefore(Integer pickupMinutesBefore) {
    this.pickupMinutesBefore = pickupMinutesBefore;
  }

  public ProductDescription pickupPlaces(List<PickupDropoffPlace> pickupPlaces) {
    this.pickupPlaces = pickupPlaces;
    return this;
  }

  public ProductDescription addPickupPlacesItem(PickupDropoffPlace pickupPlacesItem) {
    if (this.pickupPlaces == null) {
      this.pickupPlaces = new ArrayList<PickupDropoffPlace>();
    }
    this.pickupPlaces.add(pickupPlacesItem);
    return this;
  }

   /**
   * Get pickupPlaces
   * @return pickupPlaces
  **/
  @ApiModelProperty(value = "")
  public List<PickupDropoffPlace> getPickupPlaces() {
    return pickupPlaces;
  }

  public void setPickupPlaces(List<PickupDropoffPlace> pickupPlaces) {
    this.pickupPlaces = pickupPlaces;
  }

  public ProductDescription dropoffAvailable(Boolean dropoffAvailable) {
    this.dropoffAvailable = dropoffAvailable;
    return this;
  }

   /**
   * Get dropoffAvailable
   * @return dropoffAvailable
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getDropoffAvailable() {
    return dropoffAvailable;
  }

  public void setDropoffAvailable(Boolean dropoffAvailable) {
    this.dropoffAvailable = dropoffAvailable;
  }

  public ProductDescription customDropoffPlaceAllowed(Boolean customDropoffPlaceAllowed) {
    this.customDropoffPlaceAllowed = customDropoffPlaceAllowed;
    return this;
  }

   /**
   * Get customDropoffPlaceAllowed
   * @return customDropoffPlaceAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean getCustomDropoffPlaceAllowed() {
    return customDropoffPlaceAllowed;
  }

  public void setCustomDropoffPlaceAllowed(Boolean customDropoffPlaceAllowed) {
    this.customDropoffPlaceAllowed = customDropoffPlaceAllowed;
  }

  public ProductDescription dropoffPlaces(List<PickupDropoffPlace> dropoffPlaces) {
    this.dropoffPlaces = dropoffPlaces;
    return this;
  }

  public ProductDescription addDropoffPlacesItem(PickupDropoffPlace dropoffPlacesItem) {
    if (this.dropoffPlaces == null) {
      this.dropoffPlaces = new ArrayList<PickupDropoffPlace>();
    }
    this.dropoffPlaces.add(dropoffPlacesItem);
    return this;
  }

   /**
   * Get dropoffPlaces
   * @return dropoffPlaces
  **/
  @ApiModelProperty(value = "")
  public List<PickupDropoffPlace> getDropoffPlaces() {
    return dropoffPlaces;
  }

  public void setDropoffPlaces(List<PickupDropoffPlace> dropoffPlaces) {
    this.dropoffPlaces = dropoffPlaces;
  }

  public ProductDescription productCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

   /**
   * Get productCategory
   * @return productCategory
  **/
  @ApiModelProperty(required = true, value = "")
  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public ProductDescription ticketSupport(List<TicketSupport> ticketSupport) {
    this.ticketSupport = ticketSupport;
    return this;
  }

  public ProductDescription addTicketSupportItem(TicketSupport ticketSupportItem) {
    this.ticketSupport.add(ticketSupportItem);
    return this;
  }

   /**
   * Get ticketSupport
   * @return ticketSupport
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TicketSupport> getTicketSupport() {
    return ticketSupport;
  }

  public void setTicketSupport(List<TicketSupport> ticketSupport) {
    this.ticketSupport = ticketSupport;
  }

  public ProductDescription countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public ProductDescription addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public ProductDescription cities(List<String> cities) {
    this.cities = cities;
    return this;
  }

  public ProductDescription addCitiesItem(String citiesItem) {
    if (this.cities == null) {
      this.cities = new ArrayList<String>();
    }
    this.cities.add(citiesItem);
    return this;
  }

   /**
   * Get cities
   * @return cities
  **/
  @ApiModelProperty(value = "")
  public List<String> getCities() {
    return cities;
  }

  public void setCities(List<String> cities) {
    this.cities = cities;
  }

  public ProductDescription startTimes(List<Time> startTimes) {
    this.startTimes = startTimes;
    return this;
  }

  public ProductDescription addStartTimesItem(Time startTimesItem) {
    if (this.startTimes == null) {
      this.startTimes = new ArrayList<Time>();
    }
    this.startTimes.add(startTimesItem);
    return this;
  }

   /**
   * Get startTimes
   * @return startTimes
  **/
  @ApiModelProperty(value = "")
  public List<Time> getStartTimes() {
    return startTimes;
  }

  public void setStartTimes(List<Time> startTimes) {
    this.startTimes = startTimes;
  }

  public ProductDescription ticketType(TicketType ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Get ticketType
   * @return ticketType
  **/
  @ApiModelProperty(value = "")
  public TicketType getTicketType() {
    return ticketType;
  }

  public void setTicketType(TicketType ticketType) {
    this.ticketType = ticketType;
  }

  public ProductDescription meetingType(MeetingType meetingType) {
    this.meetingType = meetingType;
    return this;
  }

   /**
   * Get meetingType
   * @return meetingType
  **/
  @ApiModelProperty(required = true, value = "")
  public MeetingType getMeetingType() {
    return meetingType;
  }

  public void setMeetingType(MeetingType meetingType) {
    this.meetingType = meetingType;
  }

  public ProductDescription enforcedLeadPassengerFields(List<ContactField> enforcedLeadPassengerFields) {
    this.enforcedLeadPassengerFields = enforcedLeadPassengerFields;
    return this;
  }

  public ProductDescription addEnforcedLeadPassengerFieldsItem(ContactField enforcedLeadPassengerFieldsItem) {
    if (this.enforcedLeadPassengerFields == null) {
      this.enforcedLeadPassengerFields = new ArrayList<ContactField>();
    }
    this.enforcedLeadPassengerFields.add(enforcedLeadPassengerFieldsItem);
    return this;
  }

   /**
   * Get enforcedLeadPassengerFields
   * @return enforcedLeadPassengerFields
  **/
  @ApiModelProperty(value = "")
  public List<ContactField> getEnforcedLeadPassengerFields() {
    return enforcedLeadPassengerFields;
  }

  public void setEnforcedLeadPassengerFields(List<ContactField> enforcedLeadPassengerFields) {
    this.enforcedLeadPassengerFields = enforcedLeadPassengerFields;
  }

  public ProductDescription enforcedTravellerFields(List<ContactField> enforcedTravellerFields) {
    this.enforcedTravellerFields = enforcedTravellerFields;
    return this;
  }

  public ProductDescription addEnforcedTravellerFieldsItem(ContactField enforcedTravellerFieldsItem) {
    if (this.enforcedTravellerFields == null) {
      this.enforcedTravellerFields = new ArrayList<ContactField>();
    }
    this.enforcedTravellerFields.add(enforcedTravellerFieldsItem);
    return this;
  }

   /**
   * Get enforcedTravellerFields
   * @return enforcedTravellerFields
  **/
  @ApiModelProperty(value = "")
  public List<ContactField> getEnforcedTravellerFields() {
    return enforcedTravellerFields;
  }

  public void setEnforcedTravellerFields(List<ContactField> enforcedTravellerFields) {
    this.enforcedTravellerFields = enforcedTravellerFields;
  }

  public ProductDescription extras(List<Extra> extras) {
    this.extras = extras;
    return this;
  }

  public ProductDescription addExtrasItem(Extra extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<Extra>();
    }
    this.extras.add(extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @ApiModelProperty(value = "")
  public List<Extra> getExtras() {
    return extras;
  }

  public void setExtras(List<Extra> extras) {
    this.extras = extras;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDescription productDescription = (ProductDescription) o;
    return Objects.equals(this.id, productDescription.id) &&
        Objects.equals(this.name, productDescription.name) &&
        Objects.equals(this.description, productDescription.description) &&
        Objects.equals(this.pricingCategories, productDescription.pricingCategories) &&
        Objects.equals(this.rates, productDescription.rates) &&
        Objects.equals(this.allYearOpeningHours, productDescription.allYearOpeningHours) &&
        Objects.equals(this.seasonalOpeningHours, productDescription.seasonalOpeningHours) &&
        Objects.equals(this.bookingType, productDescription.bookingType) &&
        Objects.equals(this.customPickupPlaceAllowed, productDescription.customPickupPlaceAllowed) &&
        Objects.equals(this.pickupMinutesBefore, productDescription.pickupMinutesBefore) &&
        Objects.equals(this.pickupPlaces, productDescription.pickupPlaces) &&
        Objects.equals(this.dropoffAvailable, productDescription.dropoffAvailable) &&
        Objects.equals(this.customDropoffPlaceAllowed, productDescription.customDropoffPlaceAllowed) &&
        Objects.equals(this.dropoffPlaces, productDescription.dropoffPlaces) &&
        Objects.equals(this.productCategory, productDescription.productCategory) &&
        Objects.equals(this.ticketSupport, productDescription.ticketSupport) &&
        Objects.equals(this.countries, productDescription.countries) &&
        Objects.equals(this.cities, productDescription.cities) &&
        Objects.equals(this.startTimes, productDescription.startTimes) &&
        Objects.equals(this.ticketType, productDescription.ticketType) &&
        Objects.equals(this.meetingType, productDescription.meetingType) &&
        Objects.equals(this.enforcedLeadPassengerFields, productDescription.enforcedLeadPassengerFields) &&
        Objects.equals(this.enforcedTravellerFields, productDescription.enforcedTravellerFields) &&
        Objects.equals(this.extras, productDescription.extras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, pricingCategories, rates, allYearOpeningHours, seasonalOpeningHours, bookingType, customPickupPlaceAllowed, pickupMinutesBefore, pickupPlaces, dropoffAvailable, customDropoffPlaceAllowed, dropoffPlaces, productCategory, ticketSupport, countries, cities, startTimes, ticketType, meetingType, enforcedLeadPassengerFields, enforcedTravellerFields, extras);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pricingCategories: ").append(toIndentedString(pricingCategories)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    allYearOpeningHours: ").append(toIndentedString(allYearOpeningHours)).append("\n");
    sb.append("    seasonalOpeningHours: ").append(toIndentedString(seasonalOpeningHours)).append("\n");
    sb.append("    bookingType: ").append(toIndentedString(bookingType)).append("\n");
    sb.append("    customPickupPlaceAllowed: ").append(toIndentedString(customPickupPlaceAllowed)).append("\n");
    sb.append("    pickupMinutesBefore: ").append(toIndentedString(pickupMinutesBefore)).append("\n");
    sb.append("    pickupPlaces: ").append(toIndentedString(pickupPlaces)).append("\n");
    sb.append("    dropoffAvailable: ").append(toIndentedString(dropoffAvailable)).append("\n");
    sb.append("    customDropoffPlaceAllowed: ").append(toIndentedString(customDropoffPlaceAllowed)).append("\n");
    sb.append("    dropoffPlaces: ").append(toIndentedString(dropoffPlaces)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    ticketSupport: ").append(toIndentedString(ticketSupport)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
    sb.append("    startTimes: ").append(toIndentedString(startTimes)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    meetingType: ").append(toIndentedString(meetingType)).append("\n");
    sb.append("    enforcedLeadPassengerFields: ").append(toIndentedString(enforcedLeadPassengerFields)).append("\n");
    sb.append("    enforcedTravellerFields: ").append(toIndentedString(enforcedTravellerFields)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
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

