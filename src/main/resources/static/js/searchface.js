/**
 * Created by xiao on 2016/6/6.
 */

// prepare the form when the DOM is ready
$(document).ready(function () {
    var options = {
        target: '#output2',   // target element(s) to be updated with server response
        beforeSubmit: showRequest,  // pre-submit callback
        success: showResponse,  // post-submit callback

        // other available options:
        url: "/searchFace1VN",         // override for form's 'action' attribute
        type: "post",        // 'get' or 'post', override for form's 'method' attribute
        dataType: "json",        // 'xml', 'script', or 'json' (expected server response type)
        clearForm: false,        // clear all form fields after successful submit
        resetForm: false,       // reset the form after successful submit

        // $.ajax options can be used here too, for example:
        timeout: 3000
    };

    // bind to the form's submit event
    $('#formHandingFace').submit(function () {
        // inside event callbacks 'this' is the DOM element so we first
        // wrap it in a jQuery object and then invoke ajaxSubmit
        $(this).ajaxSubmit(options);

        // !!! Important !!!
        // always return false to prevent standard browser submit and page navigation
        return false;
    });
});

// post-submit callback
function showResponse(responseText, statusText) {
    alert('status: ' + statusText + '\n\nresponseText: \n' + responseText +
        '\n\nThe output div should have already been updated with the responseText.');
}

// pre-submit callback
function showRequest(formData, jqForm, options) {
    var queryString = $('#formHandingFace').formSerialize();
    alert('About:' + queryString);
    return true;
}
