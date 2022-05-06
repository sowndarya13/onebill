import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "./button.css";
const buttonstyle = {
  marginLeft: 480,
  paddingBottom: 0.4,
};
const button = {
  marginLeft: 4,
  paddingBottom: 0.4,
};
const h6style = {
  marginLeft: 200,
};
const button1 = {
  marginLeft: 500,
  marginTop: 20,
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
function Extra() {
  return (
    <div style={borderstyle}>
      <h5 style={styling}>Extra Details</h5>
      <form style={formstyle}>
        <h6 style={h6style}>Skill/Languages</h6>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Skill 1"
              name="skill1"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Skill 2"
              name="skill2"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Skill 3"
              name="skill3"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Skill 4"
              name="skill4"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Skill 5"
              name="skill5"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="skill 6"
              name="skill6"
            />
          </div>
        </div>
        <br></br>
        <hr></hr>
        <h6 style={h6style}>Interest</h6>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 1"
              name="interest1"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 2"
              name="interest2"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 3"
              name="interest3"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 4"
              name="interest4"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 5"
              name="interest5"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Interest 6"
              name="interest6"
            />
          </div>
        </div>
        <br></br>
      </form>
      <div class="row">
        <div class="col">
          <Link to="/experience">
            <button type="button" class="btn btn-danger" style={buttonstyle}>
              <h6>&lt;&nbsp;&nbsp;Back</h6>
            </button>
          </Link>
        </div>
        <div class="col">
          <button
            type="button"
            class="btn btn-secondary"
            style={button}
            disabled
          >
            <h6>Next &nbsp;&nbsp;&gt;</h6>
          </button>
        </div>
      </div>
      <button type="button" class="btn btn-primary" style={button1}>
        <h6>Download Resume &nbsp;&nbsp;</h6>
      </button>
    </div>
  );
}
export default Extra;
