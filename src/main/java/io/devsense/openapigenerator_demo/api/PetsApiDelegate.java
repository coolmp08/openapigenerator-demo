package io.devsense.openapigenerator_demo.api;

import io.devsense.openapigenerator_demo.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link PetsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-07-31T11:34:52.177804+05:30[Asia/Kolkata]", comments = "Generator version: 7.14.0")
public interface PetsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pets : Create a pet
     *
     * @param pet  (optional)
     * @return Pet created (status code 201)
     * @see PetsApi#createPets
     */
    default ResponseEntity<Void> createPets(Pet pet) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /pets : List all pets
     *
     * @param limit  (optional)
     * @return A paged array of pets (status code 200)
     * @see PetsApi#listPets
     */
    default ResponseEntity<List<Pet>> listPets(Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }, { \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /pets/{petId} : Info for a specific pet
     *
     * @param petId  (required)
     * @return Expected response to a valid request (status code 200)
     * @see PetsApi#showPetById
     */
    default ResponseEntity<Pet> showPetById(Integer petId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
