let course_form = document.getElementById('course-validation');
window.onload = fetch_specialization();
window.onload = fetch_courses();
async function fetch_courses() {
    let response = await fetch("api/courses/get");
    let prereq = await response.json(); // read response body and parse as JSON
    console.log(prereq);
    let pre_option = document.getElementById('prereq');
    pre_option.innerHTML = '<option value=""> Choose...</option>';

    for (let i = 0; i < prereq.length; i++) {
        pre_option.innerHTML += '<option value="' + prereq[i].name + '">' + prereq[i].name + '</option>';
    }
}
course_form.onsubmit = async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (course_form.checkValidity() === true) {
      let form_data = new FormData();
        form_data.append('course_code', document.getElementById('course_code').value);
        form_data.append('name', document.getElementById('name').value);
        form_data.append('description', document.getElementById('description').value);
        form_data.append('year', document.getElementById('year').value);
        form_data.append('term', document.getElementById('term').value);
        form_data.append('credits', document.getElementById('credits').value);
        form_data.append('capacity', document.getElementById('capacity').value);
        form_data.append('faculty', document.getElementById('faculty').value);
        // $.ajax({
        //   type: "POST",
        //   url: "api/courses/register",
        //   enctype: 'multipart/form-data',
        //   data: form_data,
        //   processData: false,
        //   contentType: false,
        // }).done(function(response, status) {
        //   console.log(response, status);
        // });
        let response = await fetch('api/courses/register', {
        method: 'POST',
        body: form_data
      });
      let result = await response;
      console.log(result);
    }
    course_form.classList.add('was-validated');
};

async function fetch_specialization(){
    let response = await fetch("api/specialization/get");
    let specialization = await response.json(); // read response body and parse as JSON
    console.log(specialization);
    let specialization_option = document.getElementById('specialization');
    specialization_option.innerHTML = '<option value=""> Choose...</option>';

    for(let i = 0 ; i<specialization.length ; i++){
        specialization_option.innerHTML += '<option value="'+specialization[i]+'">'+specialization[i]+'</option>';
    }
}