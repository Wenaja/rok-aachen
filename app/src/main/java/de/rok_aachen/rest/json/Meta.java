package de.rok_aachen.rest.json;

import java.util.ArrayList;
import java.util.List;

public class Meta {
    private boolean _EventAllDay;
    private String _EventTimezone;
    private String _EventStartDate;
    private String _EventEndDate;
    private String _EventStartDateUTC;
    private String _EventEndDateUTC;
    private boolean _EventShowMap;
    private boolean _EventShowMapLink;
    private String _EventURL;
    private String _EventCost;
    private String _EventCostDescription;
    private String _EventCurrencySymbol;
    private String _EventCurrencyPosition;
    private String _EventDateTimeSeparator;
    private String _EventTimeRangeSeparator;
    private List<Object> _EventOrganizerID;
    private int _EventVenueID;
    private String _OrganizerEmail;
    private String _OrganizerPhone;
    private String _OrganizerWebsite;
    private String _VenueAddress;
    private String _VenueCity;
    private String _VenueCountry;
    private String _VenueProvince;
    private String _VenueZip;
    private String _VenuePhone;
    private String _VenueURL;
    private String _VenueStateProvince;
    private String _VenueLat;
    private String _VenueLng;

    public boolean is_EventAllDay() {
        return _EventAllDay;
    }

    public void set_EventAllDay(boolean _EventAllDay) {
        this._EventAllDay = _EventAllDay;
    }

    public String get_EventTimezone() {
        return _EventTimezone;
    }

    public void set_EventTimezone(String _EventTimezone) {
        this._EventTimezone = _EventTimezone;
    }

    public String get_EventStartDate() {
        return _EventStartDate;
    }

    public void set_EventStartDate(String _EventStartDate) {
        this._EventStartDate = _EventStartDate;
    }

    public String get_EventEndDate() {
        return _EventEndDate;
    }

    public void set_EventEndDate(String _EventEndDate) {
        this._EventEndDate = _EventEndDate;
    }

    public String get_EventStartDateUTC() {
        return _EventStartDateUTC;
    }

    public void set_EventStartDateUTC(String _EventStartDateUTC) {
        this._EventStartDateUTC = _EventStartDateUTC;
    }

    public String get_EventEndDateUTC() {
        return _EventEndDateUTC;
    }

    public void set_EventEndDateUTC(String _EventEndDateUTC) {
        this._EventEndDateUTC = _EventEndDateUTC;
    }

    public boolean is_EventShowMap() {
        return _EventShowMap;
    }

    public void set_EventShowMap(boolean _EventShowMap) {
        this._EventShowMap = _EventShowMap;
    }

    public boolean is_EventShowMapLink() {
        return _EventShowMapLink;
    }

    public void set_EventShowMapLink(boolean _EventShowMapLink) {
        this._EventShowMapLink = _EventShowMapLink;
    }

    public String get_EventURL() {
        return _EventURL;
    }

    public void set_EventURL(String _EventURL) {
        this._EventURL = _EventURL;
    }

    public String get_EventCost() {
        return _EventCost;
    }

    public void set_EventCost(String _EventCost) {
        this._EventCost = _EventCost;
    }

    public String get_EventCostDescription() {
        return _EventCostDescription;
    }

    public void set_EventCostDescription(String _EventCostDescription) {
        this._EventCostDescription = _EventCostDescription;
    }

    public String get_EventCurrencySymbol() {
        return _EventCurrencySymbol;
    }

    public void set_EventCurrencySymbol(String _EventCurrencySymbol) {
        this._EventCurrencySymbol = _EventCurrencySymbol;
    }

    public String get_EventCurrencyPosition() {
        return _EventCurrencyPosition;
    }

    public void set_EventCurrencyPosition(String _EventCurrencyPosition) {
        this._EventCurrencyPosition = _EventCurrencyPosition;
    }

    public String get_EventDateTimeSeparator() {
        return _EventDateTimeSeparator;
    }

    public void set_EventDateTimeSeparator(String _EventDateTimeSeparator) {
        this._EventDateTimeSeparator = _EventDateTimeSeparator;
    }

    public String get_EventTimeRangeSeparator() {
        return _EventTimeRangeSeparator;
    }

    public void set_EventTimeRangeSeparator(String _EventTimeRangeSeparator) {
        this._EventTimeRangeSeparator = _EventTimeRangeSeparator;
    }

    public List<Object> get_EventOrganizerID() {
        if(_EventOrganizerID == null){
            this._EventOrganizerID = new ArrayList<Object>();
        }

        return _EventOrganizerID;
    }

    public void set_EventOrganizerID(List<Object> _EventOrganizerID) {
        this._EventOrganizerID = _EventOrganizerID;
    }

    public int get_EventVenueID() {
        return _EventVenueID;
    }

    public void set_EventVenueID(int _EventVenueID) {
        this._EventVenueID = _EventVenueID;
    }

    public String get_OrganizerEmail() {
        return _OrganizerEmail;
    }

    public void set_OrganizerEmail(String _OrganizerEmail) {
        this._OrganizerEmail = _OrganizerEmail;
    }

    public String get_OrganizerPhone() {
        return _OrganizerPhone;
    }

    public void set_OrganizerPhone(String _OrganizerPhone) {
        this._OrganizerPhone = _OrganizerPhone;
    }

    public String get_OrganizerWebsite() {
        return _OrganizerWebsite;
    }

    public void set_OrganizerWebsite(String _OrganizerWebsite) {
        this._OrganizerWebsite = _OrganizerWebsite;
    }

    public String get_VenueAddress() {
        return _VenueAddress;
    }

    public void set_VenueAddress(String _VenueAddress) {
        this._VenueAddress = _VenueAddress;
    }

    public String get_VenueCity() {
        return _VenueCity;
    }

    public void set_VenueCity(String _VenueCity) {
        this._VenueCity = _VenueCity;
    }

    public String get_VenueCountry() {
        return _VenueCountry;
    }

    public void set_VenueCountry(String _VenueCountry) {
        this._VenueCountry = _VenueCountry;
    }

    public String get_VenueProvince() {
        return _VenueProvince;
    }

    public void set_VenueProvince(String _VenueProvince) {
        this._VenueProvince = _VenueProvince;
    }

    public String get_VenueZip() {
        return _VenueZip;
    }

    public void set_VenueZip(String _VenueZip) {
        this._VenueZip = _VenueZip;
    }

    public String get_VenuePhone() {
        return _VenuePhone;
    }

    public void set_VenuePhone(String _VenuePhone) {
        this._VenuePhone = _VenuePhone;
    }

    public String get_VenueURL() {
        return _VenueURL;
    }

    public void set_VenueURL(String _VenueURL) {
        this._VenueURL = _VenueURL;
    }

    public String get_VenueStateProvince() {
        return _VenueStateProvince;
    }

    public void set_VenueStateProvince(String _VenueStateProvince) {
        this._VenueStateProvince = _VenueStateProvince;
    }

    public String get_VenueLat() {
        return _VenueLat;
    }

    public void set_VenueLat(String _VenueLat) {
        this._VenueLat = _VenueLat;
    }

    public String get_VenueLng() {
        return _VenueLng;
    }

    public void set_VenueLng(String _VenueLng) {
        this._VenueLng = _VenueLng;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "_EventAllDay=" + _EventAllDay +
                ", _EventTimezone='" + _EventTimezone + '\'' +
                ", _EventStartDate='" + _EventStartDate + '\'' +
                ", _EventEndDate='" + _EventEndDate + '\'' +
                ", _EventStartDateUTC='" + _EventStartDateUTC + '\'' +
                ", _EventEndDateUTC='" + _EventEndDateUTC + '\'' +
                ", _EventShowMap=" + _EventShowMap +
                ", _EventShowMapLink=" + _EventShowMapLink +
                ", _EventURL='" + _EventURL + '\'' +
                ", _EventCost='" + _EventCost + '\'' +
                ", _EventCostDescription='" + _EventCostDescription + '\'' +
                ", _EventCurrencySymbol='" + _EventCurrencySymbol + '\'' +
                ", _EventCurrencyPosition='" + _EventCurrencyPosition + '\'' +
                ", _EventDateTimeSeparator='" + _EventDateTimeSeparator + '\'' +
                ", _EventTimeRangeSeparator='" + _EventTimeRangeSeparator + '\'' +
                ", _EventVenueID=" + _EventVenueID +
                ", _OrganizerEmail='" + _OrganizerEmail + '\'' +
                ", _OrganizerPhone='" + _OrganizerPhone + '\'' +
                ", _OrganizerWebsite='" + _OrganizerWebsite + '\'' +
                ", _VenueAddress='" + _VenueAddress + '\'' +
                ", _VenueCity='" + _VenueCity + '\'' +
                ", _VenueCountry='" + _VenueCountry + '\'' +
                ", _VenueProvince='" + _VenueProvince + '\'' +
                ", _VenueZip='" + _VenueZip + '\'' +
                ", _VenuePhone='" + _VenuePhone + '\'' +
                ", _VenueURL='" + _VenueURL + '\'' +
                ", _VenueStateProvince='" + _VenueStateProvince + '\'' +
                ", _VenueLat='" + _VenueLat + '\'' +
                ", _VenueLng='" + _VenueLng + '\'' +
                '}';
    }
}
