# Summary

Hey URL! is a service to create awesome friendly URLs to make it easier
for people to remember. Users can create a short URL from any other URL:
the application will generate a short ID (e.g. NELNT) for the URL and
provide a new URL based on the ID that redirects to the original. Every
time someone follows the redirect the application will record
information about their visit so it can display statistics.

We have provided a skeleton Spring MVC application which contains a few
routes and some basic views so that you don't have to spend your time
setting up the framework or fighting with HTML and CSS. You will need to
persist the entities with Spring Data JPA and build out the
functionality of the controllers.

# REQUIREMENTS

These are the requirements for completion of the challenge. They're
listed in priority order, so you should complete each one before moving
on to the next.

1. Implement the action to create shorter urls based on full url when
   the user submits the creation form.
1. If submitted URL is not valid the application should return an error
   message to the user, rather than creating an invalid short URL.
1. We want to our users to see metrics for their URLs. Every time
   someone clicks their URL, it should record that click and also
   user platform and browser using the `User-Agent` request header.
1. The existing mock metrics page needs to be updated to show real data.
1. Implement API endpoint to get the 10 latest urls
1. If someone tries to visit a invalid short URL they should receive a
   nice friendly error page, not the Spring default 404 page
1. Controllers, endpoints and models should be fully tested


# URL format

* Max length 5 characters, e.g.  NELNT
* Allows Uppercase and Lowercase characters
* Allows Number
* Any non-word character is not allowed e.g whitespaces, tab,% ,$.* etc
* URL must be unique
* Original URL format should be validated 
* `shot_url` attribute should be stored only the generated code

# Pages
These mockup pages are already built into our site:

GET / : Contains url form and the 10 latest url list with their click counter

GET /:url: Saves URL information (click counter and referrer) and redirects to original url

GET /:url/stats: Shows metrics information about the given url

API (Bonus)
Also, we need to create a way to get the 10 latest urls from an API endpoint. it should be JSON API complaint. Here is an example of a response from the API:

```
{
  "data": [{
    "type": "urls",
    "id": "1",
    "attributes": {
      "created-at": "2018-08-15T02:48:08.642Z",
  "original-url": "www.fullstacklabs.co/angular-developers",
  "url": "https://domain/fss1",
  "clicks": 2
    },
    "relationships": {
      "metrics": {
        "data": [
          {
            "id": 1,
            "type": "metrics"
          }
        ]
      }
    }
  }],
  "included": []
}
```
