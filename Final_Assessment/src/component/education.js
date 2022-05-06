import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import Footer from "./footer";
import "bootstrap/dist/css/bootstrap.min.css";
import "./button.css";
import { Link } from "react-router-dom";
const buttonstyle = {
  marginLeft: 480,
  paddingBottom: 0.4,
};
const button = {
  marginLeft: 4,
  paddingBottom: 0.4,
};

const borderstyle = {
  border: "1px solid black",
  paddingTop: 2,

  paddingBottom: "30px",
  margin: "8px 100px 100px 100px",
};
const styling = {
  border: "1px solid black",
  marginTop: 2,
  marginBottom: 20,
  marginLeft: 4,
  marginRight: 4,
  paddingTop: "10px",
  paddingBottom: "10px",
  paddingLeft: "500px",
};
const formstyle = {
  paddingLeft: "30px",
  paddingRight: "30px",
};
function Education() {
  return (
    <div style={borderstyle}>
      <h5 style={styling}>Education Details</h5>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="College/University*"
              name="college"
              required
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="dd.mm.yyyy"
              name="collegeDs"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="dd.mm.yyyy"
              name="collegeDe"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col-4">
            <input
              type="text"
              class="form-control"
              placeholder="Qualification*"
              name="collegeQualification"
              required
            />
          </div>
          <div class="col-8">
            <input
              type="text"
              class="form-control"
              placeholder="Description*"
              name="collegeDescription"
              required
            />
          </div>
        </div>
        <hr></hr>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="School*"
              name="school"
              required
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="dd.mm.yyyy"
              name="schoolDs"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="dd.mm.yyyy"
              name="schoolDe"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col-4">
            <input
              type="text"
              class="form-control"
              placeholder="Qualification*"
              name="schoolQualification"
              required
            />
          </div>
          <div class="col-8">
            <input
              type="text"
              class="form-control"
              placeholder="Description*"
              name="schoolDescription"
              required
            />
          </div>
        </div>
        <br></br>
      </form>
      <div class="row">
        <div class="col">
          <Link to="/">
            <button type="button" class="btn btn-danger" style={buttonstyle}>
              <h6>&lt;&nbsp;&nbsp;Back</h6>
            </button>
          </Link>
        </div>
        <div class="col">
          <Link to="/project">
            <button type="button" class="btn btn-danger" style={button}>
              <h6>Next &nbsp;&nbsp;&gt;</h6>
            </button>
          </Link>
        </div>
      </div>
      <Footer />
    </div>
  );
}
export default Education;
