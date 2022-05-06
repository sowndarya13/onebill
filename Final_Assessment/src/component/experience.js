import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Link } from "react-router-dom";
import Footer from "./footer";
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
function Experience() {
  return (
    <div style={borderstyle}>
      <h5 style={styling}>Experience Details</h5>
      <form style={formstyle}>
        <h6 style={h6style}>Experience 1</h6>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Institute/Organization*"
              name="exp1institute"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Position*"
              name="exp1position"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Duration*"
              name="exp1duration"
            />
          </div>
        </div>
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Description*"
          name="exp1descrption"
        />
        <br></br>
        <hr></hr>
        <h6 style={h6style}>Experience 2</h6>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Institute/Organization*"
              name="exp2institute"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Position*"
              name="exp2position"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Duration*"
              name="exp2duration"
            />
          </div>
        </div>
        <br></br>
        <input
          type="text"
          class="form-control"
          placeholder="Description*"
          name="exp2descrption"
        />
        <br></br>
      </form>
      <div class="row">
        <div class="col">
          <Link to="/project">
            <button type="button" class="btn btn-danger" style={buttonstyle}>
              <h6>&lt;&nbsp;&nbsp;Back</h6>
            </button>
          </Link>
        </div>
        <div class="col">
          <Link to="/extra">
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
export default Experience;
