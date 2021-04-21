package org.eclipse.microprofile.asyncapi.models.info;

import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.info.Contact;
import org.eclipse.microprofile.openapi.models.info.License;

public interface Info extends Constructible, Extensible<Info> {

    /**
     * Returns the title for the application for this instance of Info
     *
     * @return the title of the application
     **/

    String getTitle();

    /**
     * Sets this Info instance's title for the application to the given title.
     *
     * @param title the title of the application
     */
    void setTitle(String title);

    /**
     * Sets this Info instance's title for the application to the given title and returns this instance of Info
     *
     * @param title the title of the application
     * @return this Info instance
     */
    default Info title(String title) {
        setTitle(title);
        return this;
    }

    /**
     * Returns the version of the OpenAPI document for this Info instance.
     *
     * @return the version of the OpenAPI document
     **/

    String getVersion();

    /**
     * Sets the version of the OpenAPI document for this instance of Info to the given version.
     *
     * @param version the version of the OpenAPI document
     */
    void setVersion(String version);

    /**
     * Sets the version of the OpenAPI document for this instance of Info to the given version and returns this instance of Info
     *
     * @param version the version of the OpenAPI document
     * @return this Info instance
     */
    default Info version(String version) {
        setVersion(version);
        return this;
    }

    /**
     * Returns a short description for the application for this Info instance.
     *
     * @return a short description of the application
     **/

    String getDescription();

    /**
     * Sets this Info instance's description for the application to the given description.
     *
     * @param description a short description for the application
     */
    void setDescription(String description);

    /**
     * Sets this Info instance's description for the application to the given description and returns this instance of Info.
     *
     * @param description a short description for the application
     * @return this Info instance
     */
    default Info description(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns the URL to the Terms of Service for the API for this instance of Info.
     *
     * @return a URL to the Terms of Service for the API
     **/

    String getTermsOfService();

    /**
     * Sets this Info instance's URL to the Terms of Service for the API to the given String. The URL must be in the format of a URL.
     *
     * @param termsOfService the URL to the Terms of Service for the API
     */
    void setTermsOfService(String termsOfService);

    /**
     * Sets this Info instance's URL to the Terms of Service for the API to the given String and returns this instance of Info. The URL must be in the
     * format of a URL.
     *
     * @param termsOfService the URL to the Terms of Service for the API
     * @return this Info instance
     */
    default Info termsOfService(String termsOfService) {
        setTermsOfService(termsOfService);
        return this;
    }

    /**
     * Returns the contact information for the exposed API from this Info instance.
     *
     * @return the contact information for the exposed API
     **/

    Contact getContact();

    /**
     * Sets this Info instance's contact information for the exposed API.
     *
     * @param contact the contact information for the exposed API
     */
    void setContact(Contact contact);

    /**
     * Sets this Info instance's contact information for the exposed API and returns this instance of Info.
     *
     * @param contact the contact information for the exposed API
     * @return this Info instance
     */
    default Info contact(Contact contact) {
        setContact(contact);
        return this;
    }

    /**
     * Returns the license information for the exposed API from this Info instance.
     *
     * @return the license information for the exposed API
     **/

    License getLicense();

    /**
     * Sets this Info's license information for the exposed API.
     *
     * @param license the license information for the exposed API
     */
    void setLicense(License license);

    /**
     * Sets this Info's license information for the exposed API and returns this instance of Info.
     *
     * @param license the license information for the exposed API
     * @return this Info instance
     */
    default Info license(License license) {
        setLicense(license);
        return this;
    }
}
