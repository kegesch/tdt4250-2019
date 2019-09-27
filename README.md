# tdt4250-2019
Repository for the assignments of the course TDT4250 at NTNU

# Assignment 1
## Structure
### `no.tdt4250.model`
contains the source code and the model
* `src` contains the generated source code
* `model` contains the ECore model, the generator model and a dynamic instance

### `no.tdt4250.model.tests`
contains the generated and the custom tests for the source code

### Model
![Model](model.png)

# Assignment 2
## Get started
* Install BndTools
* Import all projects starting with `no.tdt4250.conversion` into the eclipse workspace

## API
Make an http `GET`-request to `localhost:8080` with parameters:
 * `value` (Double): the value that should be converted
 * `from` (String): the unit of value
 * `to` (String): the unit of the target converted value

For example: `localhost:8080/convert?from=Fahrenheit&to=Kelvin&value=20` returns following: 
```json
{
    "success": true,
    "value": 20,
    "converted": 266.4833333333333,
    "unitFrom": {
        "name": "Fahrenheit",
        "symbol": "°F"
    },
    "unitTo": {
        "name": "Kelvin",
        "symbol": "K"
    }
}
```
