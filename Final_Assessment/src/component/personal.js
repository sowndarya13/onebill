import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Link } from "react-router-dom";
import Footer from "./footer";
import { AppBar } from "@material-ui/core";
//import "./personal.css";
const button = {
  marginLeft: 4,
  paddingBottom: 0.4,
};
const buttonstyle = {
  marginLeft: 480,
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
function Personal() {
  return (
    <div style={borderstyle}>
      <AppBar />
      <h5 style={styling}>Personal Details</h5>
      <form style={formstyle}>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="First name*"
              name="fname"
              required
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Last name*"
              name="lname"
              required
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Email*"
              name="email"
              required
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Phone Number"
              name="pnumber"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Your Website"
              name="website"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="GitHub"
              name="github"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Linked In"
              name="linkedin"
            />
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Twitter"
              name="twitter"
            />
          </div>
        </div>
        <br></br>
        <div class="row">
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Facebook"
              name="fb"
            ></input>
          </div>
          <div class="col">
            <input
              type="text"
              class="form-control"
              placeholder="Instagram"
              name="insta"
            ></input>
          </div>
        </div>
      </form>
      <br></br>
      <div class="row">
        <div class="col">
          <button
            type="button"
            class="btn btn-secondary"
            style={buttonstyle}
            disabled
          >
            <h6>&lt;&nbsp;&nbsp;Back</h6>
          </button>
        </div>
        <div class="col">
          <Link to="/education">
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

export default Personal;
