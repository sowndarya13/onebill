import App1 from "./appbar";
import React, { useState } from "react";
import Routing from "./routing";

function App() {
  const [values, setValues] = useState({
    //education_details
    college: "",
    collegeDs: "",
    collegeDe: "",
    collegeQualification: "",
    collegeDesripton: "",
    school: "",
    schoolDs: "",
    schoolDe: "",
    schoolQualification: "",
    schoolDescription: "",
    //experience_details
    exp1institute: "",
    exp1position: "",
    exp1duration: "",
    exp1descrption: "",
    exp2institute: "",
    exp2position: "",
    exp2duration: "",
    exp2descrption: "",
    //extra_details
    skill1: "",
    skill2: "",
    skill3: "",
    skill4: "",
    skill5: "",
    skill6: "",
    interest1: "",
    interst2: "",
    interst3: "",
    interst4: "",
    interst5: "",
    interst6: "",
    //personal_details
    fname: "",
    lname: "",
    email: "",
    pnumber: "",
    website: "",
    github: "",
    linkedin: "",
    twitter: "",
    fb: "",
    insta: "",
    //projects_developed
    pr1title: "",
    pr1link: "",
    pr1descrption: "",
    pr2title: "",
    pr2link: "",
    pr2descrption: "",
  });
  return (
    <div>
      <App1 />
      {Routing}
    </div>
  );
}

export default App;
