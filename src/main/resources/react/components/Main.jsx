import React from 'react'
import { Switch, Route } from 'react-router-dom'
import Welcome from './Login'
import About from './About'
import Registration from './Registration';

const Main = () => (
    <main>
        <Switch>
            <Route exact path='/' component={Welcome}/>
            <Route path='/about' component={About}/>
            <Route path='/registration' component={Registration}/>
        </Switch>
    </main>
);

export default Main